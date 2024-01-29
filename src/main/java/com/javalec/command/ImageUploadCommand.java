package com.javalec.command;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import com.javalec.dao.ImageDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import java.io.IOException;

public class ImageUploadCommand implements SCommand {
	
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        int fileSize = 1024 * 1024 * 100; // 300MB로 파일 크기를 제한
        ImageDAO dao = new ImageDAO();
        
        response.setCharacterEncoding("UTF-8");
        
        try {
            // ServletContext를 사용하여 업로드 경로를 가져옴
            ServletContext context = request.getServletContext();
            String uploadPath = context.getRealPath("/images");

            // MultipartRequest를 사용하여 파일 업로드 처리
            MultipartRequest multi = new MultipartRequest(request, uploadPath, fileSize, "UTF-8", new DefaultFileRenamePolicy());

            String pronum = multi.getParameter("pronum");
    		String brand = multi.getParameter("brand");
            String proname = multi.getParameter("proname");
            String color = multi.getParameter("color");
            int stock = Integer.parseInt(multi.getParameter("stock"));
            int price = Integer.parseInt(multi.getParameter("price"));
            String imagename = multi.getFilesystemName("imagename");
            
            
            // 성공 메시지 전송
            response.getWriter().write("성공");
            dao.write(pronum, brand, proname, color, stock, price, imagename);
        } catch (Exception e) {
            // 업로드 실패 시 오류 메시지 전송
            try {
                response.getWriter().write("업로드 용량 오류 또는 그 이외..." + e.getMessage());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        
        
    }
    
}
