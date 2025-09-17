package MainForm;

import javax.swing.*;

public class CampusApp {
    private JFrame frame;

    public CampusApp() {
        frame = new JFrame("Campus App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 900);
        frame.setLocationRelativeTo(null);

        showMainForm(); // start with home screen
        frame.setVisible(true);
    }

    public void showMainForm() {
        frame.setContentPane(new MainForm(this).panelMain);
        frame.revalidate();
    }

    public void showBusRoutesUI() {
        frame.setContentPane(new BusRoutesUI(this).panelBusRoutes);
        frame.revalidate();
    }

    public void showBusLocationUI() {
        frame.setContentPane(new BusLocationUI(this).panelBusLocation);
        frame.revalidate();
    }

    public void showCampusMapUI() {
        frame.setContentPane(new CampusMapUI(this).panelCampusMap);
        frame.revalidate();
    }

    public void showBuildingMapUI() {
        frame.setContentPane(new BuildingMapUI(this).panelBuildingMap);
        frame.revalidate();
    }

    public static void main(String[] args) {
        new CampusApp();
    }
    public void showParkingUI() {
        frame.setContentPane(new ParkingUI(this).panelParking);
        frame.revalidate();
    }
    public void showParkingMapUI() {
        frame.setContentPane(new ParkingMapUI(this).panelParkingMap);
        frame.revalidate();
    }



}
