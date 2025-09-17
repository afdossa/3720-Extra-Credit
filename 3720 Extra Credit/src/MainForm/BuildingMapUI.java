package MainForm;

import javax.swing.*;
import java.awt.*;

public class BuildingMapUI {
    public JPanel panelBuildingMap; // make public

    public BuildingMapUI(CampusApp app) {
        panelBuildingMap = new JPanel(new BorderLayout(10, 10));

        // ===== Header =====
        JLabel header = new JLabel("Building Map", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        panelBuildingMap.add(header, BorderLayout.NORTH);

        // ===== Map Area =====
        JLabel mapArea = new JLabel("", SwingConstants.CENTER);
        mapArea.setOpaque(true);
        mapArea.setBackground(new Color(180, 255, 180));
        panelBuildingMap.add(mapArea, BorderLayout.CENTER);

        // ===== Back Button =====
        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.addActionListener(e -> app.showCampusMapUI());

        panelBuildingMap.add(btnBack, BorderLayout.SOUTH);
    }
}
