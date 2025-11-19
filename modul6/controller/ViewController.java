package controller;

import model.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewController {

	@FXML
	private TableView<Mahasiswa> tableMhs;
	
	@FXML
	private TableColumn<Mahasiswa, String> colNim;
	
	@FXML
	private TableColumn<Mahasiswa, String> colNama;
	
	@FXML
	public void initialize () {
		colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
		colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
		
		ObservableList<Mahasiswa> listData = FXCollections.observableArrayList(
				new Mahasiswa(1, "Akbar", "2410817210012"),
				new Mahasiswa(2, "Sahroni", "2410817210024"),
				new Mahasiswa(3, "Siti", "2410817210311"),
				new Mahasiswa(4, "Budi", "2410817210130"),
				new Mahasiswa(5, "Eman", "2410817210141"),
				new Mahasiswa(6, "Jowi", "2410817210123"),
				new Mahasiswa(7, "Rowo", "2410817210025"),
				new Mahasiswa(8, "Purya", "2410817210098"),
				new Mahasiswa(9, "Balil", "2410817210021"),
				new Mahasiswa(10, "Sutris", "2410817210022")
				);
		
		tableMhs.setItems(listData);
				
	}
}
