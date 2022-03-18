package com.availity.util;

import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;
import com.availity.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.util.List;

public class CSVtoText {

    private static final Logger LOGGER = LoggerFactory.getLogger(CSVtoText.class);

    public static void writeEmployees(PrintWriter writer, List<Employee> employees) {

        try {

            ColumnPositionMappingStrategy<Employee> mapStrategy
                    = new ColumnPositionMappingStrategy<>();

            mapStrategy.setType(Employee.class);

            String[] columns = new String[]{"id", "firstName", "lastName", "ver", "insComp"};
            mapStrategy.setColumnMapping(columns);

            StatefulBeanToCsv<Employee> btcsv = new StatefulBeanToCsvBuilder<Employee>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withMappingStrategy(mapStrategy)
                    .withSeparator(',')
                    .build();

            btcsv.write(employees);

        } catch (CsvException ex) {

            LOGGER.error("Error mapping Bean to CSV", ex);
        }
    }

    public static void writeEmployee(PrintWriter writer, Employee Employee) {

        try {

            ColumnPositionMappingStrategy<Employee> mapStrategy
                    = new ColumnPositionMappingStrategy<>();

            mapStrategy.setType(Employee.class);

            String[] columns = new String[]{"id", "firstName", "lastName", "ver", "insComp"};
            mapStrategy.setColumnMapping(columns);

            StatefulBeanToCsv<Employee> btcsv = new StatefulBeanToCsvBuilder<Employee>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withMappingStrategy(mapStrategy)
                    .withSeparator(',')
                    .build();

            btcsv.write(Employee);

        } catch (CsvException ex) {

            LOGGER.error("Error mapping Bean to CSV", ex);
        }
    }
}