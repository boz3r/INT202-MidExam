package servlet;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.RoomManage;

@WebServlet(name = "RoomList", value = "/room-list")
public class RoomList extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<RoomManage> list = (List) new RoomManage().ListRoom();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/room-list.jsp").forward(request, response);
    }
}