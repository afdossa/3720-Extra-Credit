package MainForm;

import javax.swing.*;
import java.awt.*;

public class CampusMapUI {
    public JPanel panelCampusMap; // make public
    private JLabel lblBuilding;
    private JLabel lblRoom;

    public CampusMapUI(CampusApp app) {
        panelCampusMap = new JPanel(new BorderLayout(10, 10));

        // ===== Header =====
        JLabel header = new JLabel("Campus Map", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        panelCampusMap.add(header, BorderLayout.NORTH);

        // ===== Map Area =====
        JLabel mapArea = new JLabel("", SwingConstants.CENTER);
        mapArea.setOpaque(true);
        mapArea.setBackground(new Color(180, 255, 180));
        panelCampusMap.add(mapArea, BorderLayout.CENTER);

        // ===== Bottom Section =====
        JPanel bottomPanel = new JPanel(new GridLayout(3, 1, 10, 10));

        lblBuilding = new JLabel("Building: Demo", SwingConstants.CENTER);
        lblBuilding.setOpaque(true);
        lblBuilding.setBackground(new Color(128, 0, 0)); // dark red
        lblBuilding.setForeground(Color.WHITE);
        lblBuilding.setFont(new Font("Arial", Font.BOLD, 14));

        lblRoom = new JLabel("Room: Demo", SwingConstants.CENTER);
        lblRoom.setOpaque(true);
        lblRoom.setBackground(new Color(0, 70, 128)); // dark blue
        lblRoom.setForeground(Color.WHITE);
        lblRoom.setFont(new Font("Arial", Font.BOLD, 14));

        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.addActionListener(e -> app.showMainForm());

        bottomPanel.add(lblBuilding);
        bottomPanel.add(lblRoom);
        bottomPanel.add(btnBack);

        panelCampusMap.add(bottomPanel, BorderLayout.SOUTH);

        // ===== Clickable actions =====
        lblBuilding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                app.showBuildingMapUI();
            }
        });

        lblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                app.showBuildingMapUI();
            }
        });
    }
}
