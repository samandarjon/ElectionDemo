package com.example.ElectionDemo.dao;

import com.example.ElectionDemo.dto.QuestionDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 5/1/2021 5:42 PM
 */
public class QuestionDao {

    public static List<QuestionDto> questionList = new ArrayList<>(Arrays.asList(
        new QuestionDto(1l," This is a question one"),
        new QuestionDto(2l," This is a question two")
    ));

    public static List<QuestionDto> findAll() {
        return questionList;
    }

    public static void save(QuestionDto questionDto) {
        questionDto.setId((long) (questionList.size() + 1));
        questionList.add(questionDto);
    }
}
