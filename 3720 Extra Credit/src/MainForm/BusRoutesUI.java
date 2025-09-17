package MainForm;

import javax.swing.*;
import java.awt.*;

public class BusRoutesUI {
    public JPanel panelBusRoutes;

    public BusRoutesUI(CampusApp app) {
        // Use BorderLayout to separate content from Back button cleanly
        panelBusRoutes = new JPanel(new BorderLayout(0, 0));

        // ===== Content Area =====
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        // ===== Top Header =====
        contentPanel.add(createHeader("Select Bus Route"));
        contentPanel.add(Box.createRigidArea(new Dimension(0, 5))); // spacing

// ===== Clemson Bus Section =====
        contentPanel.add(createHeader("Clemson Bus"));

        JPanel clemsonPanel = new JPanel(new GridLayout(1, 2, 0, 0));
        clemsonPanel.add(createRouteButton("Blue Route:<br>C-1 → Hendrix → Edwards → ASC → Redfern",
                new Color(41, 128, 185), app));
        clemsonPanel.add(createRouteButton("Purple Route:<br>C-13/R-3 → Brackett → Sirrine/Riggs → Freeman",
                new Color(142, 68, 173), app));
        contentPanel.add(clemsonPanel);

// ===== Orange + Tiger Transit Row =====
        JPanel specialPanel = new JPanel(new GridLayout(1, 2, 0, 0));

        JButton orangeRoute = createRouteButton("Orange Route:<br>C-3/Athletics → Brackett",
                new Color(230, 126, 34), app);

        JButton tigerTransit = createRouteButton("Tiger Transit:<br>Order a Bus",
                new Color(52, 73, 94), app);

        specialPanel.add(orangeRoute);
        specialPanel.add(tigerTransit);

        contentPanel.add(specialPanel);


        // ===== CATbus Section =====
        contentPanel.add(createHeader("CATbus"));

        JPanel catPanel1 = new JPanel(new GridLayout(1, 2, 0, 0));
        catPanel1.add(createRouteButton("Red Route:<br>Clemson ↔ Downtown",
                new Color(192, 57, 43), app));
        catPanel1.add(createRouteButton("Gold Route:<br>GrandMarc, Publix, Crawford Falls",
                new Color(241, 196, 15), app));
        contentPanel.add(catPanel1);

        JPanel catPanel2 = new JPanel(new GridLayout(1, 2, 0, 0));
        catPanel2.add(createRouteButton("Pendleton Route:<br>Thornhill, Douthit → Tri-County Tech",
                new Color(21, 67, 96), app));
        catPanel2.add(createRouteButton("View/Pier Route:<br>Apartments → Strom Thurmond",
                new Color(39, 174, 96), app));
        contentPanel.add(catPanel2);

        // ===== Greenlink Section =====
        contentPanel.add(createHeader("Greenlink"));

        JPanel greenlinkPanel = new JPanel(new GridLayout(1, 2, 0, 0));
        greenlinkPanel.add(createRouteButton("Route 602:<br>Woodruff Connector (CU-ICAR, etc.)",
                new Color(219, 10, 91), app));
        greenlinkPanel.add(createRouteButton("Route 510:<br>Laurens Rd → Downtown Greenville",
                new Color(97, 106, 107), app));
        contentPanel.add(greenlinkPanel);

        // Add content to CENTER of BorderLayout
        panelBusRoutes.add(contentPanel, BorderLayout.CENTER);

        // ===== Back Button (full width, small height, bottom) =====
        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.setFocusPainted(false);

        JPanel backPanel = new JPanel(new BorderLayout());
        backPanel.setBackground(Color.BLACK);
        backPanel.add(btnBack, BorderLayout.CENTER);
        backPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, 35)); // thin bar

        btnBack.addActionListener(e -> app.showMainForm());

        // Add Back bar pinned to SOUTH
        panelBusRoutes.add(backPanel, BorderLayout.SOUTH);
    }

    // Helper for section headers
    private JPanel createHeader(String title) {
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.BLACK);

        JLabel section = new JLabel(title, SwingConstants.CENTER);
        section.setOpaque(false);
        section.setForeground(Color.WHITE);
        section.setFont(new Font("Arial", Font.BOLD, 16));

        headerPanel.add(section, BorderLayout.CENTER);
        headerPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        return headerPanel;
    }

    // Helper for route buttons
    private JButton createRouteButton(String text, Color color, CampusApp app) {
        JButton button = new JButton("<html><center>" + text + "</center></html>");
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(0, 100));
        button.addActionListener(e -> app.showBusLocationUI());
        return button;
    }
}
