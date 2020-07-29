package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Routine;

public class RoutineValidator {
    public static List<String> validate(Routine r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;

}

    private static String _validateTitle(String title) {
        // TODO 自動生成されたメソッド・スタブ
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateContent(String content) {
        // TODO 自動生成されたメソッド・スタブ
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }

        return "";
    }
    }
