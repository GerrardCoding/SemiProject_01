package com.javalec.command;

import java.io.File;
import java.util.Base64;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part; 

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.javalec.dao.ImageDAO;
import com.javalec.dto.ImageDTO;

public class ImageUploadCommand implements SCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = "/path/to/upload/directory";

        ImageDTO imageDTO = new ImageDTO();
        
        try {
            Collection<Part> parts = request.getParts();
            
            for (Part part : parts) {
                if (part.getContentType() == null) {
                    // 폼 필드 처리
                    String fieldName = part.getName();
                    String value = request.getParameter(fieldName);

                    // imageDTO에 값 설정...
                } else {
                    // 파일 업로드 처리
                    String fileName = part.getSubmittedFileName();

                    if (fileName == null || fileName.isEmpty()) {
                        continue;
                    }

                    String filePath = uploadPath + File.separator + fileName;
                    part.write(filePath);

                    byte[] fileData = part.getInputStream().readAllBytes();
                    String base64Image = Base64.getEncoder().encodeToString(fileData);
                    imageDTO.setImage(base64Image);
                }
            }
        } catch (Exception e) {
            // 예외 기록 또는 처리
            e.printStackTrace();
            // 클라이언트에 오류 메시지 응답
            // ...
        }

        ImageDAO imageDAO = new ImageDAO();
        imageDAO.write(imageDTO.getPronum(), imageDTO.getBrand(), imageDTO.getProname(), imageDTO.getColor(),
                imageDTO.getStock(), imageDTO.getPrice(), imageDTO.getImage());
    }
}