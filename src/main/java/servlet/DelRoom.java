package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.RoomManage;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "DelRoom", value = "/room-del")
public class DelRoom extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List <RoomManage> droom = (List) new RoomManage().ListRoom();
        request.setAttribute("droom", droom);
        request.getRequestDispatcher("/room-del.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomManage m = new RoomManage();

        //String to int
        Integer istr = Integer.valueOf(request.getParameter("room-name-del"));
        m.DelRoom(istr);
        response.sendRedirect("room-list");
    }
}
