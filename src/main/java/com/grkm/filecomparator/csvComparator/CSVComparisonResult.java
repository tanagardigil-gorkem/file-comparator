package com.grkm.filecomparator.csvComparator;

import java.io.Serializable;

public class CSVComparisonResult implements Serializable {

    private int lineNumber;
    private String columnNumber;
    private String expectedValue;
    private String actualValue;

}
