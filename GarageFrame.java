package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicBoolean;

public class GarageFrame extends JFrame implements ActionListener {
    Garage myGarage = new Garage("Моят гараж");
    String columns[] = {"Type", "Registration number", "Brand"};
    String data[][] = {};
    JButton findButton;
    JButton addButton;
    JButton deleteButton;
    JButton refreshButton;
    JButton searchButton;
    JButton showButton;
    JComboBox choiceComboBox;
    JComboBox deleteComboBox;
    JTable carsTable;
    JTextField typeField;
    JTextField registrationNumberField;
    JTextField brandField;
    JTextField modelField;
    JTextField fuelConsumptionField;
    JTextField powerField;
    JTextField dateOfInsuranceField;
    JTextField dateOfRegistrationField;
    JLabel typeLabel;
    JLabel registrationNumberLabel;
    JLabel brandLabel;
    JLabel modelLabel;
    JLabel fuelConsumptionLabel;
    JLabel powerLabel;
    JLabel dateOfInsuranceLabel;
    JLabel dateOfRegistrationLabel;
    DefaultTableModel model;
    JTextField updateRegField;
    JLabel updateRegLabel;
    JTextField updateTypeField;
    JTextField updateRegistrationNumberField;
    JTextField updateBrandField;
    JTextField updateModelField;
    JTextField updateFuelConsumptionField;
    JTextField updatePowerField;
    JLabel updateTypeLabel;
    JLabel updateRegistrationNumberLabel;
    JLabel updateBrandLabel;
    JLabel updateModelLabel;
    JLabel updateFuelConsumptionLabel;
    JLabel updatePowerLabel;
    JTextField searchRegistrationNumberField;
    JTextField searchBrandField;
    JTextField searchModelField;
    JTextField searchInsuranceDateField;
    JTextField searchRegistrationDateField;
    JLabel searchRegistrationNumberLabel;
    JLabel searchBrandLabel;
    JLabel searchModelLabel;
    JLabel searchInsuranceDateLabel;
    JLabel searchRegistrationDateLabel;

    GarageFrame() {
        JLabel garageLabel = new JLabel();
        garageLabel.setText("Моят гараж");
        garageLabel.setBounds(250,20,250,50);
        garageLabel.setFont(new Font("Arial", Font.BOLD, 42));

        String[] choices = {"Добави кола", "Изтрий кола", "Обнови кола", "Потърси кола"};
        choiceComboBox = new JComboBox(choices);
        choiceComboBox.setBounds(30,50,150,30);
        choiceComboBox.setSelectedIndex(0);
        choiceComboBox.addActionListener(this);

        deleteComboBox = new JComboBox();
        deleteComboBox.setBounds(200,100,150,30);
        deleteComboBox.addActionListener(this);
        deleteComboBox.setVisible(false);

        model = new DefaultTableModel();
        carsTable = new JTable(model);
        carsTable.setBounds(200,100,400,500);
        carsTable.setVisible(false);
        JScrollPane sp = new JScrollPane(carsTable);
        model.addColumn(columns[0]);
        model.addColumn(columns[1]);
        model.addColumn(columns[2]);

        typeField = new JTextField();
        typeField.setBounds(200,100,150,30);
        registrationNumberField = new JTextField();
        registrationNumberField.setBounds(400,100,150,30);
        brandField = new JTextField();
        brandField.setBounds(200,200,150,30);
        modelField = new JTextField();
        modelField.setBounds(400,200,150,30);
        fuelConsumptionField = new JTextField();
        fuelConsumptionField.setBounds(200,300,150,30);
        powerField = new JTextField();
        powerField.setBounds(400,300,150,30);
        dateOfInsuranceField = new JTextField();
        dateOfInsuranceField.setBounds(200,400,150,30);
        dateOfRegistrationField = new JTextField();
        dateOfRegistrationField.setBounds(400,400,150,30);

        typeLabel = new JLabel();
        typeLabel.setText("Тип превозно средство");
        typeLabel.setBounds(200,70,200,30);
        typeLabel.setFont(new Font("Arial", Font.BOLD, 15));
        registrationNumberLabel = new JLabel();
        registrationNumberLabel.setText("Регистрационен номер");
        registrationNumberLabel.setBounds(400,70,200,30);
    registrationNumberLabel.setFont(new Font("Arial", Font.BOLD, 15));
        brandLabel = new JLabel();
        brandLabel.setText("Марка");
        brandLabel.setBounds(250,170,200,30);
        brandLabel.setFont(new Font("Arial", Font.BOLD, 15));
        modelLabel = new JLabel();
        modelLabel.setText("Модел");
        modelLabel.setBounds(450,170,200,30);
        modelLabel.setFont(new Font("Arial", Font.BOLD, 15));
        fuelConsumptionLabel = new JLabel();
        fuelConsumptionLabel.setText("Разход на гориво");
        fuelConsumptionLabel.setBounds(200,270,150,30);
        fuelConsumptionLabel.setFont(new Font("Arial", Font.BOLD, 15));
        powerLabel = new JLabel();
        powerLabel.setText("Мощност");
        powerLabel.setBounds(450,270,200,30);
        powerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        dateOfInsuranceLabel = new JLabel();
        dateOfInsuranceLabel.setText("Дата на застраховка");
        dateOfInsuranceLabel.setBounds(200,370,150,30);
        dateOfInsuranceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        dateOfRegistrationLabel = new JLabel();
        dateOfRegistrationLabel.setText("Дата на регистрация");
        dateOfRegistrationLabel.setBounds(400,370,150,30);
        dateOfRegistrationLabel.setFont(new Font("Arial", Font.BOLD, 15));

        updateRegLabel = new JLabel();
        updateRegLabel.setText("Въведете регистрационен номер");
        updateRegLabel.setBounds(200,70,200,30);
        updateRegLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updateRegLabel.setVisible(false);
        updateRegField = new JTextField();
        updateRegField.setBounds(200,100,150,30);
        updateRegField.setVisible(false);
        updateTypeField = new JTextField();
        updateTypeField.setBounds(200,100,150,30);
        updateTypeField.setVisible(false);
        updateRegistrationNumberField = new JTextField();
        updateRegistrationNumberField.setBounds(400,100,150,30);
        updateRegistrationNumberField.setVisible(false);
        updateBrandField = new JTextField();
        updateBrandField.setBounds(200,200,150,30);
        updateBrandField.setVisible(false);
        updateModelField = new JTextField();
        updateModelField.setBounds(400,200,150,30);
        updateModelField.setVisible(false);
        updateFuelConsumptionField = new JTextField();
        updateFuelConsumptionField.setBounds(200,300,150,30);
        updateFuelConsumptionField.setVisible(false);
        updatePowerField = new JTextField();
        updatePowerField.setBounds(400,300,150,30);
        updatePowerField.setVisible(false);

        updateTypeLabel = new JLabel();
        updateTypeLabel.setText("Тип превозно средство");
        updateTypeLabel.setBounds(200,70,200,30);
        updateTypeLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updateTypeLabel.setVisible(false);
        updateRegistrationNumberLabel = new JLabel();
        updateRegistrationNumberLabel.setText("Регистрационен номер");
        updateRegistrationNumberLabel.setBounds(400,70,200,30);
        updateRegistrationNumberLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updateRegistrationNumberLabel.setVisible(false);
        updateBrandLabel = new JLabel();
        updateBrandLabel.setText("Марка");
        updateBrandLabel.setBounds(200,170,150,30);
        updateBrandLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updateBrandLabel.setVisible(false);
        updateModelLabel = new JLabel();
        updateModelLabel.setText("Модел");
        updateModelLabel.setBounds(400,170,150,30);
        updateModelLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updateModelLabel.setVisible(false);
        updateFuelConsumptionLabel = new JLabel();
        updateFuelConsumptionLabel.setText("Разход на гориво");
        updateFuelConsumptionLabel.setBounds(200,270,150,30);
        updateFuelConsumptionLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updateFuelConsumptionLabel.setVisible(false);
        updatePowerLabel = new JLabel();
        updatePowerLabel.setText("Мощност");
        updatePowerLabel.setBounds(400,270,150,30);
        updatePowerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        updatePowerLabel.setVisible(false);

        searchRegistrationNumberField = new JTextField();
        searchRegistrationNumberField.setBounds(200,100,150,30);
        searchRegistrationNumberField.setVisible(false);
        searchBrandField = new JTextField();
        searchBrandField.setBounds(400,100,150,30);
        searchBrandField.setVisible(false);
        searchModelField = new JTextField();
        searchModelField.setBounds(200,200,150,30);
        searchModelField.setVisible(false);
        searchInsuranceDateField = new JTextField();
        searchInsuranceDateField.setBounds(400,200,150,30);
        searchInsuranceDateField.setVisible(false);
        searchRegistrationDateField = new JTextField();
        searchRegistrationDateField.setBounds(200,300,150,30);
        searchRegistrationDateField.setVisible(false);

        searchRegistrationNumberLabel = new JLabel();
        searchRegistrationNumberLabel.setText("Регистрационен номер");
        searchRegistrationNumberLabel.setBounds(200,70,200,30);
        searchRegistrationNumberLabel.setFont(new Font("Arial", Font.BOLD, 15));
        searchRegistrationNumberLabel.setVisible(false);
        searchBrandLabel = new JLabel();
        searchBrandLabel.setText("Марка");
        searchBrandLabel.setBounds(400,70,200,30);
        searchBrandLabel.setFont(new Font("Arial", Font.BOLD, 15));
        searchBrandLabel.setVisible(false);
        searchModelLabel = new JLabel();
        searchModelLabel.setText("Модел");
        searchModelLabel.setBounds(200,170,150,30);
        searchModelLabel.setFont(new Font("Arial", Font.BOLD, 15));
        searchModelLabel.setVisible(false);
        searchInsuranceDateLabel = new JLabel();
        searchInsuranceDateLabel.setText("Дата на застраховк(dd/mm/yyyy)");
        searchInsuranceDateLabel.setBounds(400,170,150,30);
        searchInsuranceDateLabel.setFont(new Font("Arial", Font.BOLD, 15));
        searchInsuranceDateLabel.setVisible(false);
        searchRegistrationDateLabel = new JLabel();
        searchRegistrationDateLabel.setText("Дата на регистрация(dd/mm/yyyy)");
        searchRegistrationDateLabel.setBounds(200,270,150,30);
        searchRegistrationDateLabel.setFont(new Font("Arial", Font.BOLD, 15));
        searchRegistrationDateLabel.setVisible(false);

        findButton = new JButton();
        findButton.setBounds(400,100,130,50 );
        findButton.addActionListener(this);
        findButton.setText("Търси по регистрация");
        findButton.setVisible(false);
        addButton = new JButton();
        addButton.setBounds(30,275,130,50 );
        addButton.addActionListener(this);
        addButton.setText("Добави");
        deleteButton = new JButton();
        deleteButton.setBounds(30,350,130,50 );
        deleteButton.addActionListener(this);
        deleteButton.setText("Изтрий");
        deleteButton.setEnabled(false);
        refreshButton = new JButton();
        refreshButton.setBounds(30,425,130,50 );
        refreshButton.addActionListener(this);
        refreshButton.setText("Обнови");
        refreshButton.setEnabled(false);
        searchButton = new JButton();
        searchButton.setBounds(30,500,130,50);
        searchButton.addActionListener(this);
        searchButton.setText("Потърси");
        searchButton.setEnabled(false);
        showButton = new JButton();
        showButton.setBounds(30,575,130,50 );
        showButton.addActionListener(this);
        showButton.setText("Покажи всички");

        this.setTitle("Garage App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700,700);
        this.setResizable(false);
        this.setVisible(true);
        this.add(garageLabel);
        this.add(choiceComboBox);
        this.add(deleteComboBox);
        this.add(typeLabel);
        this.add(registrationNumberLabel);
        this.add(brandLabel);
        this.add(modelLabel);
        this.add(dateOfInsuranceLabel);
        this.add(dateOfRegistrationLabel);
        this.add(fuelConsumptionLabel);
        this.add(powerLabel);
        this.add(typeField);
        this.add(registrationNumberField);
        this.add(brandField);
        this.add(modelField);
        this.add(fuelConsumptionField);
        this.add(powerField);
        this.add(dateOfInsuranceField);
        this.add(dateOfRegistrationField);
        this.add(updateRegLabel);
        this.add(updateRegField);
        this.add(updateTypeLabel);
        this.add(updateRegistrationNumberLabel);
        this.add(updateBrandLabel);
        this.add(updateModelLabel);
        this.add(updateFuelConsumptionLabel);
        this.add(updatePowerLabel);
        this.add(updateTypeField);
        this.add(updateRegistrationNumberField);
        this.add(updateBrandField);
        this.add(updateModelField);
        this.add(updateFuelConsumptionField);
        this.add(updatePowerField);
        this.add(searchRegistrationNumberLabel);
        this.add(searchBrandLabel);
        this.add(searchModelLabel);
        this.add(searchInsuranceDateLabel);
        this.add(searchRegistrationDateLabel);
        this.add(searchRegistrationNumberField);
        this.add(searchBrandField);
        this.add(searchModelField);
        this.add(searchInsuranceDateField);
        this.add(searchRegistrationDateField);
        this.add(carsTable);
        this.add(findButton);
        this.add(addButton);
        this.add(deleteButton);
        this.add(refreshButton);
        this.add(searchButton);
        this.add(showButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton) {
            boolean isFilled = ValidateCar(typeField.getText(), registrationNumberField.getText(), brandField.getText(),
                        modelField.getText(), Integer.parseInt(fuelConsumptionField.getText()),Integer.parseInt( powerField.getText()));
            if(isFilled) {
                Car currCar = null;
                try {
                    currCar = new Car(typeField.getText(), registrationNumberField.getText(), brandField.getText(),
                            modelField.getText(), Integer.parseInt(fuelConsumptionField.getText()), Integer.parseInt(powerField.getText()),
                            new SimpleDateFormat("dd/MM/yyyy").parse(dateOfInsuranceField.getText()), new SimpleDateFormat("dd/MM/yyyy").parse(dateOfRegistrationField.getText()));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                myGarage.addCar(currCar);
                model.insertRow(carsTable.getRowCount(), new Object[]{ currCar.type, currCar.registrationNumber, currCar.brand});
                emptyAddFields();
            }
        } else if(e.getSource() == deleteButton) {
            var regNumber = deleteComboBox.getSelectedItem().toString();
            model.removeRow(deleteComboBox.getSelectedIndex());
            myGarage.getCars().remove(deleteComboBox.getSelectedIndex());
            deleteComboBox.removeAllItems();
            for(int i =0; i< myGarage.getCars().size();i++) {
                deleteComboBox.addItem(myGarage.getCars().get(i).registrationNumber);
            }
            deleteComboBox.setSelectedIndex(-1);
        } else if(e.getSource() == refreshButton) {
            //change record
            model.setRowCount(0);
            var cars = myGarage.getCars();

            for(var car : cars) {
                if (car.registrationNumber.equals(updateRegField.getText())) {
                    car.registrationNumber = updateRegistrationNumberField.getText();
                    car.type = updateTypeField.getText();
                    car.brand = updateBrandField.getText();
                    car.model = updateModelField.getText();
                    car.setFuelConsumption(Integer.valueOf(updateFuelConsumptionField.getText()));
                    car.setPower(Integer.valueOf(updatePowerField.getText()));
                }
                model.addRow(new Object[] {car.type, car.registrationNumber, car.brand});
            }

            emptyUpdateFields();
            updateRegField.setText("");
            hideAndShowUpdateComponents(false);
            choiceComboBox.setSelectedIndex(-1);
            refreshButton.setEnabled(false);
        } else if(e.getSource() == searchButton) {
            model.setRowCount(0);
            hideAndShowSearchComponents(false);
            var cars = myGarage.getCars();
            for(var car : cars) {
                if ((!searchRegistrationNumberField.getText().isEmpty() && searchRegistrationNumberField.getText().equals(car.registrationNumber)) ||
                    (!searchBrandField.getText().isEmpty() && searchBrandField.getText().equals(car.brand)) ||
                    (!searchModelField.getText().isEmpty() && searchModelField.getText().equals(car.model)) ||
                    (!searchInsuranceDateField.getText().isEmpty() && searchInsuranceDateField.getText().equals(new SimpleDateFormat("dd/MM/yyyy").format(car.getDateOfInsurance()).toString())) ||
                    (!searchRegistrationDateField.getText().isEmpty() && searchInsuranceDateField.getText().equals(new SimpleDateFormat("dd/MM/yyyy").format(car.getDateOfInsurance()).toString()))) {
                    model.addRow(new Object[] {car.type, car.registrationNumber, car.brand});
                }
            }
            carsTable.setVisible(true);
            choiceComboBox.setSelectedIndex(-1);
            searchButton.setEnabled(false);
            emptySearchFields();
        } else if(e.getSource() == showButton) {
            model.setRowCount(0);
            var cars = myGarage.getCars();

            for(var car : cars) {
                model.addRow(new Object[] {car.type, car.registrationNumber, car.brand});
            }
            hideAndShowAddComponents(false);
            hideAndShowSearchComponents(false);
            choiceComboBox.setSelectedIndex(-1);
            addButton.setEnabled(false);
            deleteButton.setEnabled(false);
            refreshButton.setEnabled(false);
            searchButton.setEnabled(false);
            carsTable.setVisible(true);
            deleteComboBox.setVisible(false);
            updateRegLabel.setVisible(false);
            updateRegField.setVisible(false);
            findButton.setVisible(false);
        } else if(e.getSource() == findButton) {
            var regSearched = updateRegField.getText();
            AtomicBoolean isFound = new AtomicBoolean(false);
            myGarage.getCars().forEach((temp) -> {
                if(temp.registrationNumber.equals(regSearched)) {
                    updateTypeField.setText(temp.type);
                    updateRegistrationNumberField.setText(temp.registrationNumber);
                    updateBrandField.setText(temp.brand);
                    updateModelField.setText(temp.model);
                    updateFuelConsumptionField.setText(temp.getFuelConsumption().toString());
                    updatePowerField.setText(temp.getPower().toString());
                    updateRegLabel.setVisible(false);
                    updateRegField.setVisible(false);
                    findButton.setVisible(false);
                    hideAndShowUpdateComponents(true);
                    refreshButton.setEnabled(true);
                    isFound.set(true);
                    hideAndShowUpdateComponents(true);
                }
            });
            if(!isFound.get()){
                updateRegLabel.setVisible(false);
                updateRegField.setVisible(false);
                updateRegField.setText("");
                findButton.setVisible(false);
                choiceComboBox.setSelectedIndex(-1);
            }
        } else if(e.getSource() == choiceComboBox) {
            switch(choiceComboBox.getSelectedIndex()) {
                case 0:
                    emptyAddFields();
                    hideAndShowAddComponents(true);
                    hideAndShowUpdateComponents(false);
                    hideAndShowSearchComponents(false);
                    carsTable.setVisible(false);
                    addButton.setEnabled(true);
                    deleteButton.setEnabled(false);
                    refreshButton.setEnabled(false);
                    deleteComboBox.setVisible(false);
                    updateRegLabel.setVisible(false);
                    updateRegField.setVisible(false);
                    findButton.setVisible(false);
                    break;
                case 1:
                    hideAndShowAddComponents(false);
                    hideAndShowUpdateComponents(false);
                    hideAndShowSearchComponents(false);
                    carsTable.setVisible(false);
                    addButton.setEnabled(false);
                    deleteButton.setEnabled(true);
                    refreshButton.setEnabled(false);
                    deleteComboBox.setVisible(true);
                    deleteComboBox.removeAllItems();
                    for(int i =0; i< myGarage.getCars().size();i++) {
                        deleteComboBox.addItem(myGarage.getCars().get(i).registrationNumber);
                    }
                    deleteComboBox.setSelectedIndex(-1);
                    updateRegLabel.setVisible(false);
                    updateRegField.setVisible(false);
                    findButton.setVisible(false);
                    break;
                case 2:
                    updateRegLabel.setVisible(true);
                    updateRegField.setVisible(true);
                    findButton.setVisible(true);
                    hideAndShowAddComponents(false);
                    hideAndShowUpdateComponents(false);
                    hideAndShowSearchComponents(false);
                    carsTable.setVisible(false);
                    addButton.setEnabled(false);
                    deleteButton.setEnabled(false);
                    refreshButton.setEnabled(false);
                    deleteComboBox.setVisible(false);
                    break;
                case 3:
                    hideAndShowSearchComponents(true);
                    hideAndShowAddComponents(false);
                    hideAndShowUpdateComponents(false);
                    searchButton.setEnabled(true);
                    carsTable.setVisible(false);
                    addButton.setEnabled(false);
                    deleteButton.setEnabled(false);
                    refreshButton.setEnabled(false);
                    deleteComboBox.setVisible(false);
                    updateRegLabel.setVisible(false);
                    updateRegField.setVisible(false);
                    findButton.setVisible(false);
                    break;
            }
        }
    }

    private boolean ValidateCar(String type, String registrationNumber, String brand, String model,
                        Integer fuelConsumption, Integer power) {
        if(type.length() > 100 || registrationNumber.length() > 10 || brand.length() > 20
            || model.length() > 20 || fuelConsumption <= 0 || power <= 0) {
            return false;
        }
        return true;
    }

    private void hideAndShowAddComponents(boolean isShown) {
        typeField.setVisible(isShown);
        registrationNumberField.setVisible(isShown);
        brandField.setVisible(isShown);
        modelField.setVisible(isShown);
        fuelConsumptionField.setVisible(isShown);
        powerField.setVisible(isShown);
        dateOfInsuranceField.setVisible(isShown);
        dateOfRegistrationField.setVisible(isShown);
        typeLabel.setVisible(isShown);
        registrationNumberLabel.setVisible(isShown);
        brandLabel.setVisible(isShown);
        modelLabel.setVisible(isShown);
        fuelConsumptionLabel.setVisible(isShown);
        powerLabel.setVisible(isShown);
        dateOfInsuranceLabel.setVisible(isShown);
        dateOfRegistrationLabel.setVisible(isShown);
    }

    private void hideAndShowUpdateComponents(boolean isShown) {
        updateTypeField.setVisible(isShown);
        updateRegistrationNumberField.setVisible(isShown);
        updateBrandField.setVisible(isShown);
        updateModelField.setVisible(isShown);
        updateFuelConsumptionField.setVisible(isShown);
        updatePowerField.setVisible(isShown);
        updateTypeLabel.setVisible(isShown);
        updateRegistrationNumberLabel.setVisible(isShown);
        updateBrandLabel.setVisible(isShown);
        updateModelLabel.setVisible(isShown);
        updateFuelConsumptionLabel.setVisible(isShown);
        updatePowerLabel.setVisible(isShown);
    }

    private void hideAndShowSearchComponents(boolean isShown) {
        searchRegistrationNumberField.setVisible(isShown);
        searchBrandField.setVisible(isShown);
        searchModelField.setVisible(isShown);
        searchInsuranceDateField.setVisible(isShown);
        searchRegistrationDateField.setVisible(isShown);
        searchRegistrationNumberLabel.setVisible(isShown);
        searchBrandLabel.setVisible(isShown);
        searchModelLabel.setVisible(isShown);
        searchInsuranceDateLabel.setVisible(isShown);
        searchRegistrationDateLabel.setVisible(isShown);
    }

    private void emptyAddFields() {
        typeField.setText("");
        registrationNumberField.setText("");
        brandField.setText("");
        modelField.setText("");
        fuelConsumptionField.setText("");
        powerField.setText("");
        dateOfInsuranceField.setText("");
        dateOfRegistrationField.setText("");
    }

    private void emptyUpdateFields() {
        updateTypeField.setText("");
        updateRegistrationNumberField.setText("");
        updateBrandField.setText("");
        updateModelField.setText("");
        updateFuelConsumptionField.setText("");
        updatePowerField.setText("");
    }

    private void emptySearchFields() {
        searchRegistrationNumberField.setText("");
        searchBrandField.setText("");
        searchModelField.setText("");
        searchInsuranceDateField.setText("");
        searchRegistrationDateField.setText("");
    }
}
