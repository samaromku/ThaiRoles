package com.example.alino4ka.thairoles;
import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String body;
    private String russianBody;
    private List<Answer> answers1 = new ArrayList<>();
    private int id = 1;
    private int questionId;
    private boolean isCorrect = false;

    public int getQuestionId() {
        return questionId;
    }

    public String getBody() {
        return body;
    }

    public List<Answer> getAnswers() {
        return answers1;
    }

    public String getRussianBody() {
        return russianBody;
    }

    public int getId() {
        return id;
    }

    public Answer(){}

    public List<Answer> addToAnswers(){
        ArrayList<Answer> answers = new ArrayList<>();
        answers.add(new Answer(1, "May make a U-turn", "Может сделать разворот", true));
        answers.add(new Answer(1, "Stop or slow down", "Останавливается или замедляется"));
        answers.add(new Answer(1, "May not make a right turn", "не может повернуть направо"));
        answers.add(new Answer(1, "May not pass or otherwise move into the lane on the right", "Не может проехать или иначе двигаться в полосу справа"));

        answers.add(new Answer(2, "In an intersection", "на перекрестке"));
        answers.add(new Answer(2, "In the pedestrian crossing", "на пешехоодном переходе"));
        answers.add(new Answer(2, "On the bridge", "на мосту"));
        answers.add(new Answer(2, "Where traffic lanes are devided by a broker line", "там, полоса движения разделены прерывистой линией", true));

        answers.add(new Answer(3, "Pass on the left on a road with two or more lanes of traffic moving in the same direction", "Пересекать налево дорого с двумя или более полосами движения с одним направлением"));
        answers.add(new Answer(3, "Drive when there is insufficient light", "ехать при недостатчном освещении"));
        answers.add(new Answer(3, "Drive a racing car on a public road with teh permission of the relevant traffic authorities", "ехать на гоночном автомобиле по общественной дороге с разрешения соответствующих органов управления дорожным движением\n"));
        answers.add(new Answer(3, "Operate a motor vehicle if you feel the onset of a heart attack", "Управлять автомобилем, если вы чувствуете начало сердечного приступа", true));

        answers.add(new Answer(4, "Stop.Give larger vehicles the right of way", "Остановиться. Дать большему транспортному средству право проезда"));
        answers.add(new Answer(4, "Stop to allow cross traffic or traffic on the main road to pass before proceeding","остановиться чтобы пропустить проезжающие машины на главной дороге перед дальнейшим движением", true));
        answers.add(new Answer(4, "Reduce your speed and give other vehicles the right of way", "Снизьте скорость и дать другим транспортным средствам право проезда"));
        answers.add(new Answer(4, "Stop.Give smaller vehicles the right of way", "Остановитесь. Дайтеболее маленькому ТСправо проезда"));

        answers.add(new Answer(5, "In the spaces between traffic islands", "В промежутки между островками движения"));
        answers.add(new Answer(5, "Where another vehicle is following at a distance of less than 150 meters", "Если другое транспортное средство следует на расстоянии менее 150 метров"));
        answers.add(new Answer(5, "Within 150 meters of the base of a bridge", "В пределах 150 метров от основания моста"));
        answers.add(new Answer(5, "In an intersection", "на перекрестке", true));

        answers.add(new Answer(6, "In front of a school", "Перед школой"));
        answers.add(new Answer(6, "On the right-hand side of a two-way street", "На правой стороне двухсторонней улицы", true));
        answers.add(new Answer(6, "On a grade", "под уклоном"));
        answers.add(new Answer(6, "In front of a police station", "Перед полицейским участком"));

        answers.add(new Answer(7, "Car may enter the road ahead", "Автомобиль может выйти на дорогу впереди"));
        answers.add(new Answer(7, "Cars may not enter the road ahead", "Автомобиль не может выйти на дорогу впереди", true));
        answers.add(new Answer(7, "Road ahead closed to all traffic", "Дорога впереди закрыта для всего трафика"));
        answers.add(new Answer(7, "Parking for all cars only", "Парковка только для машин"));

        answers.add(new Answer(8, "When you are passing on the left on a road with two or more lanes moving in the same direction", "Когда вы проезжаете налево по дороге с двумя или более полосами движения, движущимися в одном направлении"));
        answers.add(new Answer(8, "When you are passing on the left and the vehicle being passed is waiting to turn right", "Когда вы проезжаете налево и проезжающее транспортное средство ждет, чтобы повернуть вправо"));
        answers.add(new Answer(8, "Within 30 meters of a crossroad", "В 30 метрах от перекрестка", true));
        answers.add(new Answer(8, "Where the road is divided by a broken line", "Если дорога разделена пунктирной линией"));

        answers.add(new Answer(9, "You may display license plates that you have had made yourself", "Вы можете отображать номерные знаки, которые вы сами создали"));
        answers.add(new Answer(9, "You may allow unlicensed drivers to use your vehicle", "Вы можете разрешить нелицензированным водителям использовать ваш автомобиль"));
        answers.add(new Answer(9, "It is prohibited to drive a vehicle for which the annual tax has not been paid", "Запрещается водить транспортное средство, за которое не был уплачен годовой налог", true));
        answers.add(new Answer(9, "You may allow someone else to use your driver license", "Вы можете разрешить кому-либо другому использовать вашу водительскую лицензию"));

        answers.add(new Answer(10, "See the picture on the right hand", "Смотри картинку справа"));
        answers.add(new Answer(10, "See the picture on the right hand", "Смотри картинку справа"));
        answers.add(new Answer(10, "See the picture on the right hand", "Смотри картинку справа"));
        answers.add(new Answer(10, "See the picture on the right hand", "Смотри картинку справа"));

        answers.add(new Answer(11, "See the picture on the right hand", "Смотри картинку справа"));
        answers.add(new Answer(11, "See the picture on the right hand", "Смотри картинку справа"));
        answers.add(new Answer(11, "See the picture on the right hand", "Смотри картинку справа"));
        answers.add(new Answer(11, "See the picture on the right hand", "Смотри картинку справа"));

        answers.add(new Answer(12, "Bridge ahead", "Впереди мост"));
        answers.add(new Answer(12, "Road narrows ahead", "Сужение дороги", true));
        answers.add(new Answer(12, "Parallel road ahead", "Параллельно дороге"));
        answers.add(new Answer(12, "Tunnel ahead", "Туннель впереди"));

        answers.add(new Answer(13, "When it rains:When seeking to overtake other vehicles in a emergancy", "Когда идет дождь: стремясь обогнать другие автомобили в условиях непредвиденных обстоятельств"));
        answers.add(new Answer(13, "When heavy fog retricts visibility to less than 150 meters", "Когда сильный туман ограничивает видимость менее чем на 150 метров", true));
        answers.add(new Answer(13, "When you intend to make a right turn", "Когда вы намереваетесь сделать правый поворот"));
        answers.add(new Answer(13, "Not pass", "Не пропускают"));

        answers.add(new Answer(14, "Enter halfway into the next lane when an obstruction blocks the left side of the lane are driving in", "Войдите на полпути в следующую полосу, когда препятствие блокирует левую сторону полосы."));
        answers.add(new Answer(14, "Make a turn into the bus lane", "Сделайте поворот на автобусной полосе"));
        answers.add(new Answer(14, "Drive a racing car on public road with the permission of the relevant traffic authorities", "Ведите гоночный автомобиль по общественной дороге с разрешения соответствующих органов управления дорожным движением"));
        answers.add(new Answer(14, "Carry loads that obstruct your vision behind and to the sides of your vehicle", "Везти грузы, которые мешают вашему видению сзади и по сторонам вашего автомобиля", true));

        answers.add(new Answer(15, "Reduce your speed and check for oncoming traffic before crossing. One-lane bridge ahead", "Уменьшите скорость и проверьте пересечение встречного трафика. Однополосный мост впереди", true));
        answers.add(new Answer(15, "Use low gear.High bridge", "Используйте пониженную передачу. Высокий мост"));
        answers.add(new Answer(15, "Reduce your speed and proceed across the bridge", "Уменьшите скорость и проедьте через мост"));
        answers.add(new Answer(15, "Reduce your speed and use the detour.Bridge out", "Уменьшите скорость и используйте объезд."));

        answers.add(new Answer(16, "Stop, then proceed only when it is safe to do so", "Остановитесь, а затем действуйте только тогда, когда это безопасно.", true));
        answers.add(new Answer(16, "Not enter the road ahead", "Не заходить на дорогу, которая впереди"));
        answers.add(new Answer(16, "Proceed with caution", "Действовать с осторожностью"));
        answers.add(new Answer(16, "Reduce your speed.Then proceed with caution when it is safe to do so", "Уменьшите скорость. Затем будьте осторожны, когда это безопасно."));

        answers.add(new Answer(17, "", ""));

        //повторяется
        answers.add(new Answer(18, "Stop, then proceed only when it is safe to do so", "Остановитесь, а затем действуйте только тогда, когда это безопаснo", true));
        answers.add(new Answer(18, "Not enter the road ahead", "Не заходить на дорогу, которая впереди"));
        answers.add(new Answer(18, "Proceed with caution", "Действовать с осторожностью"));
        answers.add(new Answer(18, "Reduce your speed.Then proceed with caution when it is safe to do so", "Уменьшите скорость. Затем будьте осторожны, когда это безопасно."));



        answers.add(new Answer(19, "Only cars may enter", "Вьезд только для машин"));
        answers.add(new Answer(19, "Parking for cars only", "Парковка только для машин"));
        answers.add(new Answer(19, "The road ahead is closed to all traffic", "Дорога впереди закрыта для всего трафика" ));
        answers.add(new Answer(19, "Cars may not enter the road ahead", "Автомобили не могут выходить на дорогу", true));

        answers.add(new Answer(20, "Put on your right turn signal and wait for Car A to pass before proceeding", "Включите свой правый сигнал поворота и дождитесь, пока автомобиль А пройдет, прежде чем продолжить", true));
        answers.add(new Answer(20, "Stop and wait for other car to pass", "Остановитесь и ждите пока проедет другая машина"));
        answers.add(new Answer(20, "Put on your right turn signal and pass on the left without delay", "Включите свой правый указатель поворота и проезжайте слева без задержки"));
        answers.add(new Answer(20, "Move to the right and proceed around the obstruction without delay", "Двигайтесь вправо и без промедления обходите препятствие"));

        answers.add(new Answer(21, "", ""));

        //повторяется
        answers.add(new Answer(22, "Tunnel ahead", "Тунель впереди"));
        answers.add(new Answer(22, "Lane closed ahead", "Линия впереди закрыта "));
        answers.add(new Answer(22, "Roads narrows ahead", "Дороги сужаются впереди", true));
        answers.add(new Answer(22, "Bridge ahead", "Мост впереди"));

        answers.add(new Answer(23, "Move your car off the road and turn on emergency flashes", "Переместите свой автомобиль с дороги и включите аварийки"));
        answers.add(new Answer(23, "The driver of the car in the picture may turn right", "Водитель машины, изображенной на картинке, может повернуть направо"));
        answers.add(new Answer(23, "The driver of the car in the picture may not pull into the right lane to overtake anothervehicle", "Водитель автомобиля, изображенный на картинке, может не влезать в правую полосу, чтобы обогнать другой автомобиль", true));
        answers.add(new Answer(23, "The driver of the car in the picture may make a U-turn", "Водитель машины, изображенной на картинке, может сделать разворот"));

        answers.add(new Answer(24, "School zone.Watch for children", "Школьная территория.Следите за детьми", true));
        answers.add(new Answer(24, "Pedestrian bridge ahead", "Пешеходный мост впереди"));
        answers.add(new Answer(24, "No outlet", "Нет выхода"));
        answers.add(new Answer(24, "Pedestrian crossing", "Пешеходный переход"));

        answers.add(new Answer(25, "The minimum speed limit is 30 kilometeres per hour", "Минимальное органичение скорости - 30 километров в час ", true));
        answers.add(new Answer(25, "Vehicles weighng more than 30 tons are prohibited", "Транспортные средства массой более 30 тонн запрещены"));
        answers.add(new Answer(25, "The maximum speed limit is 30 kilometers per hour", "Максимальное ограничение скорости - 30 километров в час "));
        answers.add(new Answer(25, "Vehicle carrying loads weighing more than 30 tons are prohibited", "Транспортные средства с грузом весом более 30 тонн запрещены"));

        answers.add(new Answer(26, "The entrance/exit to a building", "Вход / выход в здание"));
        answers.add(new Answer(26, "Absolutely no stopping in this area", "Однозначно не останавливайтесь в этой области", true));
        answers.add(new Answer(26, "No vehicles may cross the cross-hatched lines", "Никакие транспортные средства не могут пересекать заштрихованные линии"));
        answers.add(new Answer(26, "No passing within the cross-hatched lines", "Отсутствие прохождения в пределах перечеркнутых линий"));


        answers.add(new Answer(27, "A vehicle with a horn louder than 70-decibels", "Автомобиль с рупором громче 70-децибел"));
        answers.add(new Answer(27, "A vehicle without a front wind shield", "Транспортное средство без переднего ветрового стекла", true));
        answers.add(new Answer(27, "A vehicle displaying dealer's plates", "Транспортное средство, отображающее пластины дилера"));
        answers.add(new Answer(27, "A tank used war face", "Танк использовал лицо войны"));

        answers.add(new Answer(28, "Reduce his/her speed to allow the cars on the left and right to pass before proceeding", "Уменьшите его / ее скорость, чтобы позволить автомобилям слева и справа пройти перед продолжением"));
        answers.add(new Answer(28, "Stop to allow the car on the right to pass before proceeding", "Остановитесь, чтобы автомобиль справа прошел, прежде чем продолжить движение"));
        answers.add(new Answer(28, "Stop to allow the car on the left to pass before proceeding", "Остановитесь, чтобы позволить машине слева пройти перед продолжением движения", true));
        answers.add(new Answer(28, "Stop and wait for other car to pass", "Остановка и ожидание проезда другой машины"));

        answers.add(new Answer(29, "Right turn permitted", "Разрешен правый поворот"));
        answers.add(new Answer(29, "Left turn permitted","Разрешен левый поворот"));
        answers.add(new Answer(29, "No right turn","Нет поворота направо", true));
        answers.add(new Answer(29, "Sharp curve ahead","Крутой поворот впереди"));


        answers.add(new Answer(30, "Slow-moving vehicles must use the left lane","Медленные транспортные средства должны использовать левую полосу движения", true));
        answers.add(new Answer(30, "Within the Bangkok Metropolitan Area, The maximum speed limit is 60 kilometers per hour","В пределах столичного района Бангкока максимальный предел скорости составляет 60 километров в час"));
        answers.add(new Answer(30, "When making a right turn, you should extend your right arm from the vehicle at shoulder-level and raise and lower ......","не переводимо"));
        answers.add(new Answer(30, "When making a turn,you should give a signal at least 60 meters before turning","При повороте вы должны подать сигнал не менее, чем на 60 метров до поворота"));

        answers.add(new Answer(31, "Within 15 meters of a fire hydrant","В пределах 15 метров от пожарного гидранта"));
        answers.add(new Answer(31, "Within 15 meters of a traffic light","В 15 метрах от светофора"));
        answers.add(new Answer(31, "Within 15 meters of a railroad crossing","В пределах 15 метров от железнодорожного переезда", true));
        answers.add(new Answer(31, "Within 15 meters of a pedestrian crossing","В 15 метрах от пешеходного перехода"));

        answers.add(new Answer(32, "",""));


        answers.add(new Answer(33, "Keep your foot on the brake","Держите ногу на тормозе"));
        answers.add(new Answer(33, "Use a low gear","Используйте низкую передачу", true));
        answers.add(new Answer(33, "Shift to neutral","Передите на нейтралку"));
        answers.add(new Answer(33, "Turn off your engine","Отключить двигатель"));

        answers.add(new Answer(34, "Keep the right","Придерживайтесь правой стороны"));
        answers.add(new Answer(34, "All traffic must move to the right","Все движение должено двигаться вправо", true));
        answers.add(new Answer(34, "Right turn allowed","Разрешен поворот вправо"));
        answers.add(new Answer(34, "No left turn","Нет разворота налево"));


        answers.add(new Answer(35, "Move to the left", "Передвиньтесь влево"));
        answers.add(new Answer(35, "Single-lane traffic", "Односторонее двидение"));
        answers.add(new Answer(35, "Do not pass", "Обгон запрещен", true));
        answers.add(new Answer(35, "One-way traffic", "Одностороннее движение"));

        answers.add(new Answer(36, "A tractor with rubber tires", "Трактор с резиновыми шинами"));
        answers.add(new Answer(36, "A tank used in war face", "Танк использует лицо войны"));
        answers.add(new Answer(36, "A vehicle with an 80-decibel engine", "Транспортное средство с двигателем 80 децибел"));
        answers.add(new Answer(36, "A vehicle with broken taillight", "Транспортное средство со сломанным задним фонарем", true));

        answers.add(new Answer(37, "Lower your speed and turn left without delay", "Сбавьте свою скорость и поверните налево без задержки"));
        answers.add(new Answer(37, "Stop.Wait for pedestrains and other vehicles form the right ot pass in front of you before turning left", "Стоп. Подождите, пока пешеходы и другие транспортные средства с правой стороны пройдут перед вами, прежде чем поворачивать налево", true));
        answers.add(new Answer(37, "Stop.Wait for a green light before turning left", "Стоп. Дождитесь зелений свет до того, как повернуть налево"));
        answers.add(new Answer(37, "Turn left without stopping", "Поворачивайте налево, без остановки"));


        answers.add(new Answer(38, "Far enough to allow you to stop safety in a emergency", "Достаточно далеко, чтобы позволить вам прекратить безопасность в чрезвычайной ситуации", true));
        answers.add(new Answer(38, "50 meters", "50 метров"));
        answers.add(new Answer(38, "18 meters", "18 метров"));
        answers.add(new Answer(38, "30 meters", "30 метров"));

        answers.add(new Answer(39, "Put on your right turn signal and pass on the left without delay", "Включите свой правый указатель поворота и проедьте слева без задержки"));
        answers.add(new Answer(39, "Move to the right and proceed around the obstruction without delay", "Двигайтесь вправо и без промедления обходите препятствие"));
        answers.add(new Answer(39, "Put on your right turn signal and wait for Car A to pass before proceeding", "Включите свой правый сигнал поворота и дождитесь, пока автомобиль А пройдет, прежде чем продолжить движение", true));
        answers.add(new Answer(39, "Stop and wait for another car to pass", "Остановитесь и ждите проезда другой машины"));

        answers.add(new Answer(40, "Stop and slow down", "Остановитесь и двигайтесь медленно"));
        answers.add(new Answer(40, "The car traveling faster", "Автомобиль едет быстрее"));
        answers.add(new Answer(40, "Car B", "Машина B"));
        answers.add(new Answer(40, "Car A", "Машина A", true));

        answers.add(new Answer(41, "", ""));

        answers.add(new Answer(42, "Make a turn into the bus lane", "Сделайте поворот на автобусной полосе"));
        answers.add(new Answer(42, "Drive a racing car on a public road with the permission of the relevant traffic authorities", "Гоните гоночный автомобиль по общественной дороге с разрешения соответствующих органов управления дорожным движением"));
        answers.add(new Answer(42, "Carry loads that obstruct your vision behind and to the sides of you vehicle", "Везти грузы, которые мешают вашему видению сзади и по сторонам вашего автомобиля", true));
        answers.add(new Answer(42, "Enter halfway into the next lane when an obstruction blocks the left side of the lane you are driving in", "Войдите на полпути в следующую полосу, когда препятствие блокирует левую сторону полосы, в которую вы въезжаете"));

        answers.add(new Answer(43, "Stop behind the line, and wait to make sure there is no cross traffic before proceeding", "Остановитесь позади линии и подождите, чтобы убедиться, что перекрестного движения нет, прежде чем продолжить", true));
        answers.add(new Answer(43, "Slow down", "Помедленнее"));
        answers.add(new Answer(43, "Proceed immediately without stopping or slow", "Действуйте немедленно, не останавливаясь и не замедляя"));
        answers.add(new Answer(43, "Reduce his/her speed and proceed with caution", "Уменьшите его/ее скорость и примите меры предосторожности"));

        answers.add(new Answer(44, "No passing within the cross-hatched lines", "Отсутствие прохождения в пределах перечеркнутых линий"));
        answers.add(new Answer(44, "The entrance/exit to a building", "Вход / выход в здание"));
        answers.add(new Answer(44, "No vehicles may cross the the cross-hatched lines", "Никакие транспортные средства не могут пересекать заштрихованные линии"));
        answers.add(new Answer(44, "Absolutely no stopping in this area", "Однозначно не останавливайтесь в этом месте", true));

        answers.add(new Answer(45, "May make a U-turn", "Может сделать разворот", true));
        answers.add(new Answer(45, "Stop or slow down", "Останавливается или замедляется"));
        answers.add(new Answer(45, "May not make a right turn", "не может повернуть направо"));
        answers.add(new Answer(45, "May not pass or otherwise move into the lane on the right", "Не может проехать или иначе двигаться в полосу справа"));

        answers.add(new Answer(46, "After taking medicine for diarhea", "После приема лекарств от диареи"));
        answers.add(new Answer(46, "Immediately after consuming alcohal or any other intoxicant", "Сразу после употребления алкоголя или любого другого интоксиканта", true));
        answers.add(new Answer(46, "When he/she has a cold or flu", "Когда у него простуда или грипп"));
        answers.add(new Answer(46, "When there is insufficient light", "При недостаточном освещении"));

        answers.add(new Answer(47, "Reduce your speed. The road ahead curves to the right. Drive carefully", "Уменьшите скорость. Дорога впереди кривая вправо. Ведите осторожно", true));
        answers.add(new Answer(47, "Reduce your speed, then carefully turn left", "Уменьшите скорость, затем осторожно поверните налево"));
        answers.add(new Answer(47, "No left turn", "Нет поворота налево"));
        answers.add(new Answer(47, "Do not go straight ahead", "Нет проехда вперед"));

        answers.add(new Answer(48, "Drive carefully. Winding road", "Ведите осторожно. Извилистая дорога"));
        answers.add(new Answer(48, "Watch for vehicles cutting in front", "Следите за впередиидущими транспортными средствами"));
        answers.add(new Answer(48, "Reduce your speed. The road may be slippery", "Уменьшите скорость. Дорога может быть скользкой", true));
        answers.add(new Answer(48, "Stop immediately", "Остановитесь немедленно"));

        answers.add(new Answer(49, "Driving when your ability to operate a vehicle is impaired", "Движение, когда ваша способность управлять транспортным средством ослаблена",true));
        answers.add(new Answer(49, "Driving in dim or dark conditions with the headlights on, giving visibility of 150 meters", "Вождение в темных или темных условиях с включенными фарами, обеспечивающее видимость 150 метров"));
        answers.add(new Answer(49, "Driving a racing car on a public road with the permission of the relevant traffic authorities", "Вождение гоночного автомобиля по общественной дороге с разрешения соответствующих органов управления дорожным движением"));
        answers.add(new Answer(49, "Passing on the left when the vehicle you are passing is waiting to make a right turn", "Проезжать слева, когда автомобиль, который вы проезжаете, ждет, чтобы сделать правый поворот"));

        answers.add(new Answer(50, "You may not pass on the left on a road with two or more lines moving in the same direction", "Вы не можете проходить слева по дороге с двумя или более линиями, движущимися в одном направлении"));
        answers.add(new Answer(50, "You may not pass within 150 meters of an intersection", "Вы не можете проехать в 150 метрах от перекрестка"));
        answers.add(new Answer(50, "You may not pass when there is an obstruction in the left lane", "Вы не можете проехать, когда есть препятствие на левой полосе"));
        answers.add(new Answer(50, "You may not pass on a bridge", "Вы не можете пропускать на мосту", true));

        answers.add(new Answer(51, "", ""));

        answers.add(new Answer(52, "Reduce his/her speed and proceed thought the intersection", "Уменьшите его скорость и продолжайте думать о пересечении"));
        answers.add(new Answer(52, "Slow down", "Помедленнее"));
        answers.add(new Answer(52, "Stop and wait for other cars to clear the intersection before proceeding", "Остановитесь и дождитесь, пока другие автомобили очистят перекресток, прежде чем продолжить", true));
        answers.add(new Answer(52, "Proceed through the intersection without stopping", "Проедьте через перекресток без остановки"));

        answers.add(new Answer(53, "Leave your car at the spot where it breaks down and call a mechanic immediately", "Оставьте свой автомобиль в том месте, где он сломался, и немедленно вызовите механика"));
        answers.add(new Answer(53, "Leave your car at the spot where it breaks down and arrange to have it towed immediately", "Оставьте свой автомобиль в том месте, где оно ломается, и организуйте его буксировку немедленно"));
        answers.add(new Answer(53, "Pull your vehicle on to the shoulder and turn on your emergency flashers", "Поставте свое транспортное средство на обочину и включите аварийные мигалки"));
        answers.add(new Answer(53, "Leave your car at the spot where it breaks down and arrange for repairs later", "Оставьте свой автомобиль в том месте, где оно поломалось, и организуйте ремонт позже"));

        answers.add(new Answer(54, "Stop, then proceed only when it is safe to do so", "Остановитесь, а затем действуйте только тогда, когда это безопасно.", true));
        answers.add(new Answer(54, "Not enter the road ahead", "Не проезжайте вперед"));
        answers.add(new Answer(54, "Proceed with caution", "Действовуйте с осторожностью"));
        answers.add(new Answer(54, "Reduce your speed.Then proceed with caution when it is safe to do so", "Уменьшите скорость. Затем осторожно двигайтесь, когда это будет безопасно."));

        answers.add(new Answer(55, "You may turn left", "Вы можете повернуть налево", true));
        answers.add(new Answer(55, "No left turn", "Нет поворота налево"));
        answers.add(new Answer(55, "Left curve ahead", "Левая кривая впереди"));
        answers.add(new Answer(55, "Pass the obstacle ahead on the left", "Пройдите препятствие впереди слева"));

        answers.add(new Answer(56, "When there is flooding", "Когда происходит наводнение"));
        answers.add(new Answer(56, "To use the bus lane as a passing lane", "Использовать полосу автобусную полосу в качестве полосы проезда", true));
        answers.add(new Answer(56, "In front of a hospital", "Перед госпиталем"));
        answers.add(new Answer(56, "To pass on the left when the vihicle in front of you is turning right", "Проехать слева, когда автомобиль перед вами поворачивает направо"));

        answers.add(new Answer(57, "A tractor with rubber tires", "Трактор с резиновыми шинами"));
        answers.add(new Answer(57, "A vehicle with broken brake lights", "Транспортное средство со сломанными стоп-сигналами", true));
        answers.add(new Answer(57, "A tank used in war faсe", "Танк при использовании лица войны"));
        answers.add(new Answer(57, "A vehicle whose engine is louder than 80 decibels", "Автомобиль, двигатель которого громче 80 децибел"));

        answers.add(new Answer(58, "When you are passing on the left and the vehicle being passed is waiting to turn right", "Когда вы проезжаете налево и проезжающее транспортное средство ждет, чтобы повернуть вправо"));
        answers.add(new Answer(58, "Where the road is divided by a broken line", "Если дорога разделена пунктирной линией"));
        answers.add(new Answer(58, "When you are passing on the left a road with two or more lanes moving in the same direction", "Когда вы проходите по левой дороге с двумя или более полосами движения, движущимися в одном направлении"));
        answers.add(new Answer(58, "Within 30 meters of a crossroad", "В 30 метрах от перекрестка", true));

        answers.add(new Answer(59, "Slow down", "Помедленнее"));
        answers.add(new Answer(59, "Being to turn right,then stop to allow the pedestrians to cross the street before completing the turn", "Чтобы повернуть направо, остановитесь, чтобы позволить пешеходам перейти улицу до завершения поворота", true));
        answers.add(new Answer(59, "Stop allow the pedestrians in the crosswalk to rach the other side of the street before turning right", "Остановка позволяет пешеходам на пешеходном переходе достичь другой стороны улицы до поворота направо"));
        answers.add(new Answer(59, "Turn immediately without stopping", "Поверните немедленно, не останавливаясь"));

        answers.add(new Answer(60, "In an intersection", "В перекрестке", true));
        answers.add(new Answer(60, "Within 150 meters of a bridge ", "В 150 метрах от моста"));
        answers.add(new Answer(60, "In front of a hospital", "Перед госпиталем"));
        answers.add(new Answer(60, "Where another vehicle is following at a distance of less than 120 meters", "Если другое транспортное средство следует на расстоянии менее 120 метров"));
















        return answers;
    }

    public Answer(int questionId, String body, String russianBody){
        this.questionId = questionId;
        this.body = body;
        this.russianBody= russianBody;
    }

    public Answer(int questionId, String body, String russianBody, boolean isCorrect){
        this.questionId = questionId;
        this.body = body;
        this.russianBody= russianBody;
        this.isCorrect = isCorrect;
    }


}

