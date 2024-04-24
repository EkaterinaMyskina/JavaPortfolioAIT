package homework25;

public enum AutoEnum {

    // 1. BASIC DATA - основная информация
    VINCODE, // vin код - уникальный идентификатор для каждой машины - STRING
    BRAND, // бренд - STRING
    MODEL, // модель - STRING
    PRICE, // цена от: any 500$,1000$,...(шаг 500$) до: any 500$,1000$,...(шаг 500$)  - INTEGER?
    YEAR,// год производства - INTEGER
    FUELTYPE, // diesel,petrol, hybrid  - STRING
    // (petrol/electric), hybrid (diesel/electric), electric, LPG, natural gas, hydrogen, ethanol(FFV, E85,etc.), plug-in-hybrid - STRING
    PAYMENTTYPE, // тип оплаты: buy, leasing, credit - STRING

    ISAUTHORISATION, // есть ли авторизация для редактирования каталога машин - boolean

}

/*
    TRANSMISSION, // коробка передач.Варианты: automatic, semi-automatic, manual gearbox // автомат, полу-автомат, ручная коробка - STRING
    TYPE, // тип машины: Cabriolet/Roadsted, Sports Car/Coupe, Estate Car, SUV/Off-road Vechicle/Pickup Truck,
    // Saloon, Van/Minibus, Small Car, Other
    QTYOFSEATS, // количество сидений: from any, 2,..., 9 to any, 2,..., 9  - INTEGER or STRING ?
    QTYOFDORS, // количество дверей: any, 2/3, 4/5, 6/7 - INTEGER
    SLIDINGDOOR, // скользящая дверь: any, sliding door right, sliding door left, sliding door both sided  - STRING

    TYPEOFCAR, // новая, подержанная, пре-регистрация, машина сотрудника, под запчасти, с тест-драйва=с витрины - STRING
    ONLINBUY, // купить онлайн - boolean


    FIRSTREGISTRATIONDATE, // дата первой регистрации: from 2020 to 2024 - INTEGER
    KILOMETRE, // километраж: from any,5000, ...km to ... 200 000 km (5000,10000, дальше шаг 10 000 км) - BOOLEAN
    TEHOSMOTR, // есть или нет. В продвинутой версии указываем до какого месяца и года действует - BOOLEAN
    QTYOFOWNERS, // кол-во владельцев - INTEGER

    // 1. TECHNICAL DATA - технические характеристики
    FUELTYPE, // diesel,petrol, hybrid (petrol/electric), hybrid (diesel/electric), electric, LPG, natural gas, hydrogen, ethanol(FFV, E85,etc.), plug-in-hybrid - STRING
    POWER, // мощность машины может измеряться в лошадиных силах = HP (horse power) или kW (kiloWatt-килоВатт) - INTEGER.
    CUBICCAPACITY, // Рабочий объем двигателя измеряется в литрах (л) или кубических сантиметрах (см3) и обычно указывается в технической документации или на кузове авто. пример: 9000 cm3 - INTEGER
    TRANSMISSION, // коробка передач.Варианты: automatic, semi-automatic, manual gearbox // автомат, полу-автомат, ручная коробка - STRING
    FUELCONSUMPTION, // потребление топлива.Тут возможны варианты, либо мы упростим. Если сложнее, то потребление бывает в городе, на трассе, при полной загрузке авто... - пример: 3l/100 km - STRING
    EMISSIONSTICKER, // 1- none, 2-red, 3-yellow, 4- green
    EMISSIONCLASS, // euro1, euro2, euro3, euro4, euro5, euro6, euro6c, euro6d-TEMP,euro6d  - STRING

    // 3. EXTERIOR - внешнее оборудование
    EXTERIORCOLOUR, // цвет салона - STRING
    TRAILERCOUPLING, // прицеп. any, fix,detachable or swieveling, detachable or swiveling, swiveling - STRING
    PARKINGSENSORS, // парковочные датчики: rear, front, camera 360 degrees camera, self-steering systems // возможен одновременный выбор нескольких- STRING
    CRUISECONTROL, // круиз-контроль: any (любой), cruise control, adaptive cruise control
    ABS, // система активной безопасности, предотвращающая блокировку колес транспортного средства при торможении. - BOOLEAN
    ADAPTIVECORNERINGLIGHTS, // адаптивные боковые огни - BOOLEAN
    ADAPTIVELIGHTING, // адаптивное освещение - BOOLEAN
    AIRSUSPENSION, // пневматическая подвеска - BOOLEAN
    ALLOYWHEELS, // легкосплавные диски - BOOLEAN
    ALLSEASONTYRES, // всесезонные шины - BOOLEAN
    BIXENONHEADLIGHTS, // биксеноновые фары - BOOLEAN
    BLINDSPOTASSISTANT, // ассистент по слепым зонам - BOOLEAN
    CENTRALLOCKING, //центральный замок - BOOLEAN
    DAYTIMERUNNINGLIGHTS,// габаритные огни - BOOLEAN
    DISTANCEWARNINGSYSTEM,// система предупреждения о дистанции - BOOLEAN
    ELECTIRCTAILGATE, // электрическая задняя дверь - BOOLEAN
    EMERGENCYBRAKEASSIST, // ассистент по экстренному торможению - BOOLEAN
    EMERGENCYTYRE, // АВАРИЙНАЯ ШИНА - BOOLEAN
    EMERGENCYTYREREPAIRKIT, // набор для экстренного ремонта запасного колеса - BOOLEAN
    ESP, // (Electronic Stability Program) – электронная система динамической стабилизации автомобиля. - BOOLEAN
    FOGLAMP, // противотуманная фара - BOOLEAN
    FOURWHEELDRIVE, // полный привод - BOOLEAN
    GLAREFREEHIGHBEAMHEADLIGHTS, // безбликовый дальний свет фар - BOOLEAN
    HEADLIGHTWASHERSYSTEM, // система омывателя фар - BOOLEAN
    HEATEDWINDSHIELD,// обогрев лобового стекла - BOOLEAN
    HIGHBEAMASSIST, // помощь при дальнем свете - BOOLEAN
    HILLSTARTASSIST, // Система помощи при трогании с места на подъеме - BOOLEAN
    IMMOBILIZER, // иммобилайзер  BOOLEAN
    KEYLESSCENTRALLOCKING, // бесключевой доступ к центральному замку  - BOOLEAN
    LANECHANGEASSISTANT, // Система помощи при смене полосы движения - BOOLEAN
    LASERHEADLIGHTS, // лазерные фары - BOOLEAN
    LEDHEADLIGHTS, // светодиодные фары - BOOLEAN
    LEDRUNNINGLIGHTS, // Светодиодные ходовые огни - BOOLEAN
    LIGHTSENSON, // Датчик освещенности - BOOLEAN
    NIGHTVISIONASSISTANT, // Система ночного видения - BOOLEAN
    PANORAMICROOF, // панорамная крыша  - BOOLEAN
    POWERASSISTEDSTEERING, // Усилитель рулевого управления - BOOLEAN
    RAINSENSOR, // датчик дождя - BOOLEAN
    ROOFRACK, // багажник - BOOLEAN
    SPARETYRE, // Запасно́е колесо́ - BOOLEAN
    SPEEDLIMITCONTROLSYSTEM, // Система контроля скоростного режима - BOOLEAN
    SPORTSPACKAGE, // Спортивный пакет - BOOLEAN
    SPORTSSUSPENSION, // Спортивная подвеска - BOOLEAN
    STARTSTOPSYSTEM, // система старта-стоп -BOOLEAN
    STEELWHEELS, // Стальные диски - BOOLEAN
    SUMMERTYRES, // летние шины - BOOLEAN
    SUNROOF, // Люк - BOOLEAN
    TRACTIONCONTROL, // Антипробуксовочная система - BOOLEAN
    TRAFFICSIGNRECOGNITION, // Распознавание дорожных знаков - BOOLEAN
    TYREPRESSUREMONITORING,//  Контроль давления в шинах - BOOLEAN
    WINTERTYRES,// зимние шины - BOOLEAN
    XENONHEADLIGHTS, // Ксеноновые фары - BOOLEAN


    // 4. INTERIOR - интерьер
    INTERIORCOLOUR, // beige, brown, grez, black, other - STRING
    INTERIORMATERIAL, // alcantara, cloth, part leather, velour, full leather, other - STRING
    AIRBAGS, // подушки безопасности: any, driver airbag, front airbags, front and slide airbags, front and slide and more airbags
    AIRCONDITIONING, // кондиционер: any,no climatisation, manual or automatic climatisation, automatic air condition, automatic climatisation, 2 zones; automatic climatisation, 3 zones; automatic climatisation, 4 zones;


    // 4.2 EXTRAS - дополнительно
    ALARMSYSTEM,// сигнализация - boolean
    AMBIENTLIGHTING,// Окружающее освещение - boolean
    ANDROIDAUTO,//  система Android для машин - boolean
    APPLECARPLAY,// система apple для машин - boolean
    ARMREST,// подлокотник - boolean
    AUTOMDIMMINGINTERIORMIRROR,// автоматическое диммированное внутреннее зеркало - boolean
    AUXILIARYHEATING,// автономное отопление - boolean
    BLUETOOTH,// - boolean
    CARGOBARRIER,// грузоудержатель - boolean
    CDPLAYER,// cd проигрыватель - boolean
    DABRADIO,//DAB = Digital Audio Broadcasting - цифровое радио - BOOLEAN
    DIGITALCOCKPIT,// цифровая приборная панель  — это полностью цифровая панель приборов, ориентированная исключительно на водителя - BOOLEAN
    DISABLEDACCESSIBLE,// доступ для людей с ограниченными возможностями - boolean
    ELECTICBACKSEATADJUSTMENT,// ЭЛЕКТРОРЕГУЛИРОВКА СПИНКИ СИДЕНЬЯ - boolean
    ELECTICSEATADJUSTMENT,// ЭЛЕКТРИЧЕСКАЯ РЕГУЛИРОВКА СИДЕНИЙ - boolean
    ELECTICSIDEMIRROR,// ЭЛЕКТРИЧЕСКОЕБОКОВОЕ ЗЕРКАЛО - boolean
    ELECTICWINDOWS,// ЭЛЕКТРИЧЕСКИЕОКНА - boolean
    EMERGENCYCALLSYSTEM,//  СИСТЕМА ЭКСТРЕННОГО ВЫЗОВА -boolean
    FATIGUEWARNINGSYSTEM,// Система предупреждения об усталости -  boolean
    FOLDFLATPASSENGERSEAT,// СКЛАДНОЕПАССАЖИРСКОЕ сиденье- boolean
    HANDSFREEKIT,// НАБОР "свободные руки"-  boolean
    HEADUPDISPLAY,// ПРОЕКЦИОННЫЙ ДИСПЛЕЙ - boolean
    HEATEDREARSEATS,// ПОДОГРЕВ ЗАДНИХ СИДЕНИЙ - boolean
    HEATEDSEATS,// СИДЕНЬЯ С ПОДОГРЕВОМ -  boolean
    HEATEDSTEERINGWEEL,// рулевое управление с подогревом-boolean
    INDUCTIONCHARGINGFORSMARTPHONES,// Индукционная зарядка для смартфонов - boolean
    INTEGRATEDMUSICSTREAMING,// Интегрированная потоковая передача музыки-boolean
    ISOFIX,// крепление для детских кресел Isofix - boolean
    LEATHERSTEERINGWHEEL,// Кожаное рулевое колесо-boolean
    LUMBARSUPPORT,// Поясничная поддержка - boolean
    MASSAGESEATES,// массажные сиденья - boolean
    MULTIFUNCTIONSTEERINGWHEEL,// многофункциональный руль - boolean
    NAVIGATIONSYSTEM,// навигационная систем -  boolean
    ONBOARDCOMPUTER,// Бортовой компьютер - boolean
    PADDLESHIFTERS,// ручные подрулевые переключатели - boolean
    PASSENGERSEATISOFIXPOINT,// Пассажирское сиденье c креплением Isofix - boolean
    SEATVENTILATION,// вентиляция сидений- boolean
    SKIBAG,// багажный бокс на крышу автомобиля - boolean
    SMOKERSPACKAGE,// Пакет для курильщиков - boolean
    SOUNDSYSTEM,// аудиосистема - boolean
    SPORTSEATS,// Спортивные сиденья - boolean
    TOUCHSCREEN,// Сенсорный экран -  boolean
    TUNERRADIO,// радио -  boolean
    TV,// телевизор - boolean
    USBPORT,// USB-порт -  boolean
    VOICECONTORL,// boolean
    WINTERPACKAGE,//     ЗИМНИЙ ПАКЕТ-  boolean
    WLANWIFIHOTSPOT,// Точка доступа WLAN/ WIFI  - boolean


    // 5. OTHER DETAILS - прочие детали
    VENDOR, // продавец: any, private seller, dealear, company vehicles - STRING
    DEALERRATING, // рейтинг дилера: any, from ***, from ****, ***** - ВЫБОР ИЗ 4 вариантов
    ADONLINESINCE, // объявление выставлено: any, 1 day, 3 days, 7 days, 14 days - ВЫБОР ИЗ 5 вариантов
    ADSWITHPICTURES, // только объявления с картинками - BOOLEAN
    TAXI, // машина использовалась как такси - BOOLEAN
    ADSWITHVIDEO, // только объявления с видео - BOOLEAN
    VATRECLAIMABLE, // c возможностью возвратить НДС -BOOLEAN
    DISCOUNTOFFERS, // предложения со скидками - BOOLEAN
    WARRANTY, // Гарантия - BOOLEAN
    NONSMOKERVECHICLE, // машина для некурящих - BOOLEAN
    DAMAGEDVECHICLES, // поврежденные машины: any, do not show, only show
    COMMERCIALEXPORTIMPORT, // коммерческие экспорт/импорт: any, do not show, only show
    APPROVEDUSEDPROGRAMME,//     УТВЕРЖДЕННАЯ ИСПОЛЬЗУЕМАЯ ПРОГРАММА: any approved label,Aston Martin timeless, BMW Premium Selection, Certified by Bentley, DS Certified, Ferrari approved, Hynday promise,Jaguar APPROVED,
    // Kia Zertifizierte Gebrauchtwagen, Land Rover APPROVED, Maserati Approved,Mercedes-Benz Junge Sterne Transporter,
    // Mini Gebrauchtwagen Next, Nissan Intelligent Choice, Porsche Approved,SEAT "Das Weltauto", Selezione Lamborghini Certified Pre-Owned,
    // SKODA Plus,SPORTTICAR, VOLVO Select, VW NFZ Zertifizierte Gebrauchtwagen, VW PKW Zertifizierte Gebrauchtwagen
    SEARCHVECHICLEDESCRIPTION,// поиск по описанию машины, например: drive mode switch,LTE,thermal glazing ...
}
*/
