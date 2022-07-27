package com.mysite.sbb.question;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@AllArgsConstructor
@Controller
public class QuestionController {
  private final QuestionService questionService;

  @RequestMapping("/question/list")
  public String list(Model model) {
    List<Question> questionList = this.questionService.getList();
    model.addAttribute("questionList", questionList);
    return "question_list";
  }
  @RequestMapping(value = "/question/detail/{id}")
  public String detail(Model model, @PathVariable("id") Integer id) {
    return "question_detail";
  }
}