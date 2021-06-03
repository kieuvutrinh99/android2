package com.example.kieuvutrinh_appbtl.Activity;

import android.provider.BaseColumns;

public final class Table {
    private Table(){

    }
    //dữ liệu bảng categories
    public static class CategoriesTable implements BaseColumns{
        public static final String TABLE_NAME = "categories";
        public static final String COLUMN_NAME = "name";
    }
    //dữ liệu bảng question
    public static class QuestionsTable implements BaseColumns{
        public static final String TABLE_NAME = "questions";
        public static final String COLUMN_NAME = "name";
    }
}
