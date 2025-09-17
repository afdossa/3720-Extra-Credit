package MainForm;

import javax.swing.*;
import java.awt.*;

public class BusLocationUI {
    public JPanel panelBusLocation;

    public BusLocationUI(CampusApp app) {
        panelBusLocation = new JPanel(new BorderLayout(10, 10));

        // ===== Header =====
        JLabel header = new JLabel("Bus Location", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        panelBusLocation.add(header, BorderLayout.NORTH);

        // ===== Map / Info Area =====
        JLabel mapArea = new JLabel("Bus location map or info here", SwingConstants.CENTER);
        mapArea.setOpaque(true);
        mapArea.setBackground(new Color(200, 255, 200));
        panelBusLocation.add(mapArea, BorderLayout.CENTER);

        // ===== Back Button =====
        JButton btnBack = new JButton("Back");
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.addActionListener(e -> app.showBusRoutesUI());
        panelBusLocation.add(btnBack, BorderLayout.SOUTH);
    }
}
