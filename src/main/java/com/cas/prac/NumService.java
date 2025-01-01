package com.cas.prac;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



/**
 * 입력받은 숫자를 Num 객체로 만들어주는 서비스 레이어
 * @author 배근우
 * @version 0.0
 * */
@RequiredArgsConstructor
@Service
public class NumService {

    /**
     * Num 객체 생성 후 반환 메서드
     * @return Num객체*/
    public Num createNum(int input) { // 메서드 이름 변경 (createNum)
        // input에 대한 유효성 검사 또는 추가적인 로직이 필요하다면 이 부분에 추가
        if (input < 0) {
            throw new IllegalArgumentException("Input must be non-negative."); // 예외 처리 추가 (선택적)
        }
        return new Num(input);
    }
}
