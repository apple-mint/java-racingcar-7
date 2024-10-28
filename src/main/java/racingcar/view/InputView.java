package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputWords() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public static int inputTryNumbers() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryNumber;
        try {
            tryNumber = Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return tryNumber;
    }
}
