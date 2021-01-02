package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 맴버 서비스를 스프링 컨테이너에 가져다가 연결시켜준다
    // 스프링 컨테이너에서 맴버서비스를 가져온다 ,
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @GetMapping("members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("members/new")
    public String create(MemberForm form) {

        System.out.println(form.getNames());

        Member member = new Member();
        member.setName(form.getNames());


        memberService.join(member);

        return "redirect:/";
    }
}
