package ex10;

import ex10.alarm.Alarm;
import ex10.command.AlarmCommand;
import ex10.command.LampCommand;
import ex10.lamp.BlueLamp;
import ex10.lamp.RedLamp;

// 버튼을 팩토리 패턴을 적용해서 수정
public class ButtonFactory {
    private static ButtonFactory instance = new ButtonFactory();

    private ButtonFactory() {

    }

    public static ButtonFactory getInstance() {
        return instance;
    }

    // 적절한 버튼을 만드는 책임
    public Button createButton(String command) { // blueLamp, redLamp, alarm
        if (command.equals("blueLamp")) {
            Button blueLampButton = new Button(new LampCommand(new BlueLamp()));
            return blueLampButton;
        } else if (command.equals("redLamp")) {
            Button redLampButton = new Button(new LampCommand(new RedLamp()));
            return redLampButton;
        } else if (command.equals("alarm")) {
            Button alarmButton = new Button(new AlarmCommand(new Alarm()));
            return alarmButton;
        } else {
            System.out.println("설정된 버튼이 없습니다");
            return null;
        }
    }
}
