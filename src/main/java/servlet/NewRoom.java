package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.RoomManage;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "NewRoom", value = "/room-new")
public class NewRoom extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/room-new.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomManage rm = new RoomManage();
        rm.AddRoom(
                request.getParameter("newRoomName"),
                request.getParameter("newRoomAccess"),
                request.getParameter("newRoomPrice")
        );

        response.sendRedirect("room-list");
    }
}
