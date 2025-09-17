package MainForm;

import javax.swing.*;
import java.awt.*;

public class ParkingMapUI {
    public JPanel panelParkingMap;

    public ParkingMapUI(CampusApp app) {
        panelParkingMap = new JPanel(new BorderLayout(10, 10));

        // ===== Header =====
        JLabel header = new JLabel("Parking Map", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        panelParkingMap.add(header, BorderLayout.NORTH);

        // ===== Map Area =====
        JLabel mapArea = new JLabel("", SwingConstants.CENTER);
        mapArea.setOpaque(true);
        mapArea.setBackground(new Color(180, 255, 180)); // green placeholder
        panelParkingMap.add(mapArea, BorderLayout.CENTER);

        // ===== Back Button =====
        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.setFocusPainted(false);

        JPanel backPanel = new JPanel(new BorderLayout());
        backPanel.setBackground(Color.BLACK);
        backPanel.add(btnBack, BorderLayout.CENTER);
        backPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));

        btnBack.addActionListener(e -> app.showParkingUI());

        panelParkingMap.add(backPanel, BorderLayout.SOUTH);
    }
}
