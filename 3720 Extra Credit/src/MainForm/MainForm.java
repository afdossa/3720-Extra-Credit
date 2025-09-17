package MainForm;

import javax.swing.*;
import java.awt.*;

public class MainForm {
    public JPanel panelMain;
    public JButton btnBusRoutes;
    public JButton btnParking;
    public JLabel lblSchedule;

    public MainForm(CampusApp app) {
        panelMain = new JPanel(new BorderLayout(10, 10));

        // ===== Top Header =====
        JLabel header = new JLabel("Getting To Campus", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.BLACK);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        panelMain.add(header, BorderLayout.NORTH);

        // ===== Center (buttons row + schedule) =====
        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));

        // Buttons row
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        btnBusRoutes = new JButton("Bus Routes");
        btnBusRoutes.setBackground(new Color(155, 89, 182));
        btnBusRoutes.setForeground(Color.WHITE);
        btnBusRoutes.setFont(new Font("Arial", Font.BOLD, 14));

        btnParking = new JButton("Parking");
        btnParking.setBackground(new Color(230, 126, 34));
        btnParking.setForeground(Color.WHITE);
        btnParking.setFont(new Font("Arial", Font.BOLD, 14));

        buttonsPanel.add(btnBusRoutes);
        buttonsPanel.add(btnParking);

        centerPanel.add(buttonsPanel, BorderLayout.NORTH);

        // Schedule header + green area
        JPanel schedulePanel = new JPanel(new BorderLayout());
        JLabel scheduleHeader = new JLabel("Your Schedule", SwingConstants.CENTER);
        scheduleHeader.setOpaque(true);
        scheduleHeader.setBackground(Color.BLACK);
        scheduleHeader.setForeground(Color.WHITE);
        scheduleHeader.setFont(new Font("Arial", Font.BOLD, 16));

        lblSchedule = new JLabel("", SwingConstants.CENTER);
        lblSchedule.setOpaque(true);
        lblSchedule.setBackground(new Color(200, 255, 200));

        schedulePanel.add(scheduleHeader, BorderLayout.NORTH);
        schedulePanel.add(lblSchedule, BorderLayout.CENTER);

        centerPanel.add(schedulePanel, BorderLayout.CENTER);

        panelMain.add(centerPanel, BorderLayout.CENTER);

        // ===== Actions =====
        btnBusRoutes.addActionListener(e -> app.showBusRoutesUI());
        btnParking.addActionListener(e -> app.showParkingUI());
        lblSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                app.showCampusMapUI();
            }
        });
    }
}
