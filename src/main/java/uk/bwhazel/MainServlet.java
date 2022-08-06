package uk.bwhazel;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Handler for the root URL of the application.
 */
@WebServlet(
        name = "Main",
        urlPatterns = { "/" }
)
public class MainServlet extends HttpServlet {
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param req The servlet request.
     * @param resp The servlet response.
     * @throws ServletException if the <code>GET</code> request could not be handled.
     * @throws IOException if an I/O error occurs while handling the <code>GET</code> request.
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}