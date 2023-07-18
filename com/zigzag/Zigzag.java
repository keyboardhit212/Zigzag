package com.zigzag;

public class Zigzag {

    private String word;
    private int rows;
    private StringBuilder[] stringRows;
    private StringBuilder result;

    public Zigzag(int rows, String word) throws Exception {
        if (rows <= 0 || word.length() < 1)
            throw new Exception("Invalid Word or Rows");
        this.word = word.replaceAll(" ", "");
        this.rows = rows;
        this.result = new StringBuilder();
        this.stringRows = new StringBuilder[rows];
        initialize();
        appendResult();
    }

    public String getResult() {
        return this.result.toString();
    }

    private void initialize() {
        initializeRows();
        initializeResults();
    }

    private void initializeRows() {
        for (int i = 0; i < this.stringRows.length; i++)
            this.stringRows[i] = new StringBuilder();
    }

    private void initializeResults() {
        int count = 0;
        while (count < this.word.length()) {
            int i = 0;
            for (; i < this.rows && count < this.word.length(); i++, count++)
                this.stringRows[i].append(this.word.charAt(count));
            for (i = this.rows - 2; i > 0 && count < this.word.length(); i--, count++)
                this.stringRows[i].append(this.word.charAt(count));
        }
    }

    private void appendResult() {
        for (int i = 0; i < this.stringRows.length; i++) {
            this.result.append(this.stringRows[i].toString());
        }
    }


}
