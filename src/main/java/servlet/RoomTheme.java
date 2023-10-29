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

        //set like setAttribute. Same as jsp, when calling it.
        Cookie ck = new Cookie("roomColor", roomColor);
        response.addCookie(ck);

        //redirect to index.jsp after doPost
        response.sendRedirect("index.jsp");
    }
}