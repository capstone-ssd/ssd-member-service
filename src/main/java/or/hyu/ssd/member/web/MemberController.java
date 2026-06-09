package or.hyu.ssd.member.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/members")
public class MemberController {

    @GetMapping("/me")
    public Map<String, Object> me() {
        return Map.of(
                "service", "ssd-member-service",
                "memberId", 1L,
                "nickname", "msa-demo-user");
    }
}
