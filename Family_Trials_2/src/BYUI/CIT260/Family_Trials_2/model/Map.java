/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author krist
 */
public class Map implements Serializable {
    
    // class instances
    private String description;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    private Location[][] locations;

    /**
     *
     * @param noOfRow
     * @param noOfCol
     */
    public Map(int noOfRow, int noOfCol) {
        this.rowCount = noOfRow;
        this.columnCount = noOfCol;
        this.locations = new Location[noOfRow][noOfCol];
    }
    

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.currentRow) ^ (Double.doubleToLongBits(this.currentRow) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.currentColumn) ^ (Double.doubleToLongBits(this.currentColumn) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentRow) != Double.doubleToLongBits(other.currentRow)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentColumn) != Double.doubleToLongBits(other.currentColumn)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }
    
    
    
}
