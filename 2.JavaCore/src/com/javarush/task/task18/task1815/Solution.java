package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface obj = null;

        public TableInterfaceWrapper(TableInterface obj) {
            this.obj = obj;
        }

        @Override
        public void setModel(List rows) {
            this.obj.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return this.obj.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.obj.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}