package servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RoomTheme", value = "/room-theme")
public class RoomTheme  extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/room-theme.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //this is the name of submit from jsp.
        String roomColor = request.getParameter("userRoomColor");
        
        //cookies จะเก็บที่ฝั่ง client ซึ่งจะใช้เก็บข้อมูลที่ไม่ได้สำคัญ และ cookies จะมี life-time ว่าจะหมดเมื่อไร และจะเก็บข้อมุลที่ไม่ sensitive มาก
        //set like setAttribute. Same as jsp, when calling it.
        Cookie ck = new Cookie("roomColor", roomColor);

        //ส่ง cookie กลับไปที่ client
        response.addCookie(ck);

        //redirect to index.jsp after doPost
        response.sendRedirect("index.jsp");
    }
}
