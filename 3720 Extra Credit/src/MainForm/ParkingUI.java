package MainForm;

import javax.swing.*;
import java.awt.*;

public class ParkingUI {
    public JPanel panelParking;

    public ParkingUI(CampusApp app) {
        panelParking = new JPanel();
        panelParking.setLayout(new BoxLayout(panelParking, BoxLayout.Y_AXIS));

        // ===== Header =====
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.BLACK);

        JLabel header = new JLabel("Parking Capacity", SwingConstants.CENTER);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));

        headerPanel.add(header, BorderLayout.CENTER);
        headerPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        panelParking.add(headerPanel);

        // ===== Parking Lot Tiles (2 per row) =====
        JPanel row1 = new JPanel(new GridLayout(1, 2, 10, 10));
        row1.add(createLotTile("Lot C-1", 120, "green", app));
        row1.add(createLotTile("Lot R-1", 95, "yellow", app));
        panelParking.add(row1);

        JPanel row2 = new JPanel(new GridLayout(1, 2, 10, 10));
        row2.add(createLotTile("Lot P-1", 60, "red", app));
        row2.add(createLotTile("Lot C-2", 140, "green", app));
        panelParking.add(row2);

        JPanel row3 = new JPanel(new GridLayout(1, 2, 10, 10));
        row3.add(createLotTile("Lot E-1", 80, "yellow", app));
        row3.add(createLotTile("Lot W-1", 50, "red", app));
        panelParking.add(row3);

        // ===== Back Button =====
        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(e -> app.showMainForm());

        JPanel backPanel = new JPanel(new BorderLayout());
        backPanel.setBackground(Color.BLACK);
        backPanel.add(btnBack, BorderLayout.CENTER);
        backPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));

        panelParking.add(Box.createVerticalGlue());
        panelParking.add(backPanel);
    }

    // Helper method to create each lot tile
    private JButton createLotTile(String lotName, int capacity, String status, CampusApp app) {
        Color bg;
        switch (status) {
            case "green": bg = new Color(39, 174, 96); break;  // open
            case "yellow": bg = new Color(241, 196, 15); break; // almost full
            case "red": bg = new Color(192, 57, 43); break;     // full
            default: bg = Color.GRAY; break;
        }

        JButton tile = new JButton("<html><center>" + lotName + "<br>Capacity: " + capacity + "</center></html>");
        tile.setBackground(bg);
        tile.setForeground(Color.WHITE);
        tile.setFont(new Font("Arial", Font.BOLD, 14));
        tile.setFocusPainted(false);

        // When clicked → go to ParkingMapUI
        tile.addActionListener(e -> app.showParkingMapUI());

        return tile;
    }
}
