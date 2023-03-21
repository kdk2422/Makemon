package com.example.makemon.data

import com.example.makemon.R

data class InformationOne(
    val name : Int,
    val tribe: String,
    val tribeInfo : String,
    val gender: String,
    val rank: String,
    val word: String,
    val info: String,
)

data class CharacterOne(
    val title: Int,
    val image: Int,
    val information: List<InformationOne>
)

var listDataOne = listOf(
    CharacterOne(
        title = R.string.title1,
        R.drawable.item1,
        information = listOf(
            InformationOne(
                name = R.string.name1,
                tribe = "페네페네족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「모험을 떠나볼까!」",
                info = "페넨스 성에서 태어난 왕자, 성 밖으로 빠져나갔다가 알트에게 붙잡혀 끌려오는 나날을 보내고 있다. 언젠가 마지리시아 각지를 모험하는 것이 꿈이다. 페넨스빵을 너무 좋아해서 서투른 소환 마법으로 페넨스빵을 닮은 마물을 만들어낸 적도 있다. 마력을 잘 쓰지 못하고, 마법이 서툴기 때문에 꼬리로 공격하는 것을 특기로 삼고 있다.",
            )
        )
    ),
    CharacterOne(
        title = R.string.title2,
        R.drawable.item2,
        information = listOf(
            InformationOne(
                name = R.string.name2,
                tribe = "페네페네족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「저 하늘 저편에는 무엇이 있을까...」",
                info = "페넨스 성에서 태어난 페인의 형제. 어릴 때부터 약한 몸에 시달리고 있으며 힘이 넘치는 페인을 부러워하고 있다. 막대한 마력을 축적할 수 있는 마기를 가지고 있으며 마법을 쓸 때는 자신 안의 마력이 폭주하지 않도록 세심하게 주의를 기울이고 있다. 얼음을 다루는 마법에 능함에도 불구하고 추위에 약하다. 천체 관측 및 독서가 취미. 좋아하는 음식은 크림 스튜."
            )
        )
    ),
    CharacterOne(
        title = R.string.title3,
        R.drawable.item3,
        information = listOf(
            InformationOne(
                name = R.string.name3,
                tribe = "토라토라족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「야... 오늘도 수행 안 할 거냐!!」",
                info = "검호가 되기 위해 수행 여행을 떠나고 있는 이도류 검사. 정령 실피의 바람을 검에 두르고 싸운다. 평상시에 항상 진지하지만 어딘가 얼빠진 면이 있고, 순진하다. 스승인 가우루스에게 휘둘리기만 하지만 그럭저럭 즐겁게 동행하고 있다. 종종 이복동생인 루비에게 바보 취급을 당하며, 언젠가는 아버지의 고향인 야마토로 가는 것을 꿈꾸고 있다. 좋아하는 음식은 생선."
            )
        )
    ),
    CharacterOne(
        title = R.string.title4,
        R.drawable.item4,
        information = listOf(
            InformationOne(
                name = R.string.name4,
                tribe = "우르우르족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「너도 차암 성급한 녀석이네~」",
                info = "자유롭게 방랑하는 뛰어난 검술가. 이마에 있는 제 3의 눈으로 상대방의 마음 속을 볼수있는 마기를 가졌다. 알면서도 굳이 말하지 않는 것을 좋아한다. 전투나 거리에 나갈 때는 가면을 쓰고 다닌다. 마이페이스로 평소에는 의욕이 없긴 하지만 할땐 하는 편. 유일하게 누나인 비올라에겐 고개를 들지 않는다. 금방 허기가 지는 편이며, 대식가이자 대주가이며 뭐든지 먹지만 특히 멘마를 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title5,
        R.drawable.item5,
        information = listOf(
            InformationOne(
                name = R.string.name5,
                tribe = "토라토라족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「네 놈, 나의 하인이 되어라.」",
                info = "홍월관에 살고 있는 악역무도한 귀족 소년. 오만하고 고압적인 성격. 라피스에게 마법을 배우고 있지만 선생님이 아니라 하인이라 부르고 있다. 어머니 로즈에게 충성을 맹세하며 그것이 너무 지나치다 못해 오이디푸스 콤플렉스의 경지. '루나 로드'라 불리는 지팡이는 고급 순마석으로 만들어진 일급품. 낫으로 형태를 바꿔 근거리에서의 공격도 가능하지만 그땐 피가 끓어올라 본인조차도 막을 수 없게 된다. 달의 마력으로 능력이 배로 강해진다. 고기와 적포도주를 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title6,
        R.drawable.item6,
        information = listOf(
            InformationOne(
                name = R.string.name6,
                tribe = "네코네코족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「루비님, 목소리 낮춰 주십시오.」",
                info = "러시아냐에서 태어난 마술사. 일류 마술사 일족의 혈통을 갖고 몇 초 정도 시간을 멈출 수 있는 마기를 가졌다. 온후한 성격으로 누구에게나 존댓말로 말한다. 아량이 넓고 팅과 마르스와 사이가 좋다. 솔시엘 마법학교의 시간강사이기도 하고, 루비의 가정교사이기도 하다. 루비를 놀려먹는 것이 취미지만 \"밀기보다 당기기보다 에워싸기\" 식으로 대하는 것 같다. 이가 들러붙을 정도의 아기입맛으로 코코아를 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title7,
        R.drawable.item7,
        information = listOf(
            InformationOne(
                name = R.string.name7,
                tribe = "토라토라족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「…평안하신지요」",
                info = "오랜 세월, 로젤리아의 숲 속 깊숙히 자리잡은 홍월관에 틀어박혀 있는 소녀(?) ... 마법으로 나이를 조작하고있어 어려보인다. 마력을 지속적으로 사용하는 상태이기 때문에 본래의 힘을 발휘하지 못하고 있다. 가시나무 등의 식물을 다루는 능력이 특기이다. 얼굴 표현이 서툴러 항상 눈을 부릅뜨고 있다. 항상 가지고 다니는 곰인형은 자유롭게 조종할 수 있어 일상생활에 도움이 된다. 좋아하는 음식은 사과와 홍차."
            )
        )
    ),
    CharacterOne(
        title = R.string.title8,
        R.drawable.item8,
        information = listOf(
            InformationOne(
                name = R.string.name8,
                tribe = "토라토라족",
                tribeInfo = "test",
                gender = femaleString,
                rank = rankString,
                word = "「차 준비가 다 되었어요~♪」",
                info = "로즈 일행이 사는 홍월관을 섬기는 메이드. 온후하고 배려심 많은 성격. 착실하게 일을 해내긴 하지만 덤벙거리는 면이 많아 루비에게 바보 메이드 취급을 당한다. 과거에 로즈에게 거두어져서 아가씨라 부르며 사모하고 있다. 마법이 서툰 점이 콤플렉스지만 그 대신에 매우 힘이 세다. 라피스가 말하길, 무의식적으로 신체능력을 2배로 올리는 마기에 사용하고 있기 때문인 것 같다고 한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title9,
        R.drawable.item9,
        information = listOf(
            InformationOne(
                name = R.string.name9,
                tribe = "우마우마족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「역시 난 아름다워」",
                info = "페넨스에 살고 있는 나르시스트 기질의 귀족 청년. 검사이긴 하지만 땀을 흘리는 것을 싫어하기 때문에 싸움을 좋아하지 않는다. 팬클럽이 있으며 항상 팬들을 몰고 다닌다. 의외로 상대방의 기분을 헤아리는 점도 있어 인기의 요인일지도 모른다. 팬들 사이에서 꽃미남으로 소문이 나 있는 루비를 라이벌로 보고 있지만, 자신에게 꿀리지 않는 아름다움 때문인지 지나친 호의를 보이고 있다. 백포도주를 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title10,
        R.drawable.item10,
        information = listOf(
            InformationOne(
                name = R.string.name10,
                tribe = "우마우마족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「사피르님, 오늘도 멋집니다요♥」",
                info = "사피르의 성을 섬기는 메이드. 이래 봬도 일도 잘하고 전투력도 높다. 필살기는 강력한 발굽으로 차올리는 [카마호스 킥]. 사피르는 전에는 여자 메이드가 있었지만, 팬으로부터 엄청난 야유를 받아서 이렇게 된 것 같다. 쿨한 남자였지만 여자들에게 인기가 많은 사피르에게 불만이 많아서 덤벼들었다가 사피르가 그걸 피하고나서 오히려 쥬얼리 핑크에게 호의를 배풀어서 사피르에게 반해버렸다. 그래서 여장을 해서 사피르의 메이드가 되었다. 향수 냄새가 엄청 난다. 담배를 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title11,
        R.drawable.item11,
        information = listOf(
            InformationOne(
                name = R.string.name11,
                tribe = "이누이누족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「오늘 저녁은 햄버그다!」",
                info = "나폴리오에 살고 있는 귀족 소년. 온후하고 누구에게나 친절하며 머리도 좋다. 여동생 히스이를 사랑하는 진정한 시스콘이다. 사피르와는 소꿉친구로 늘 휘둘려지는 편이다. 올드에게 의지하지 않고 집안일을 돕기도 하고 요리하는 것이 특기. 자신있는 요리는 파스타."
            )
        )
    ),
    CharacterOne(
        title = R.string.title12,
        R.drawable.item12,
        information = listOf(
            InformationOne(
                name = R.string.name12,
                tribe = "이누이누족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「오빠... 부끄러우니까 그만둬줘...!」",
                info = "에메로드의 여동생. 부끄럼이 많고 목소리가 작아 언제나 의지할 수 있는 오빠 뒤에 숨어있다. 소르시엘 마법학교에 다니면서 기초마법을 배우고 있다. 평소에 영사 일로 바빠서 자주 돌아오지 못하는 아빠랑 엄마를 기다리곤 한다. 기쁠 때는 귀를 쫑긋하고 세우는 버릇이 있다. 산타할아버지께서 주신 토끼 인형을 소중히 여기고 있다. 좋아하는 음식은 햄버그."
            )
        )
    ),
    CharacterOne(
        title = R.string.title13,
        R.drawable.item13,
        information = listOf(
            InformationOne(
                name = R.string.name13,
                tribe = "이누이누족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「히스이 님, 에메로드 님, 좋은 아침입니다.」",
                info = "히스이 일가를 돌봐주고 있는 집사. [할아범님]이라는 애칭으로 불리고 있다. 에메로드와 히스이를 소중히 여기고 있어 사사건건 기쁨의 눈물을 흘리곤 한다. 마법총을 다루는 것을 자랑거리로 삼고 있다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title14,
        R.drawable.item14,
        information = listOf(
            InformationOne(
                name = R.string.name14,
                tribe = "네코네코족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「한 곡 듣고 가실까요?」",
                info = "러시아냐 태생의 음악가. 엄격한 아버지의 영향으로 어릴 적부터 날마다 피아노 연습을 받게 되었다. 극도로 여자를 밝힌다. 남자 앞에서는 말투가 달라진다. 애용하는 지휘봉은 마법 지팡이로도 쓸 수 있고 소리의 마법을 특기로 삼고 있다. 오닉스와는 소꿉친구. 좋아하는 음식은 샌드위치."
            )
        )
    ),
    CharacterOne(
        title = R.string.title15,
        R.drawable.item15,
        information = listOf(
            InformationOne(
                name = R.string.name15,
                tribe = "네코네코족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「제기랄… 왜 또 저 녀석만…」",
                info = "러시아냐 태생의 음악가. 말투는 거칠지만 예의 바르고 남에게는 경어를 사용한다. 화가 많아서 작곡이 잘 되지 않으면 악보를 찢거나 태워버리곤 한다. 음악 외길로 어렵게 생활하고 있어 마법이 서투른 편이다. 그 천재 음악가 아담을 동경하며 음악의 길로 들어섰지만 아담의 친아들 알마스에게 질투심을 가지고 있다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title16,
        R.drawable.item16,
        information = listOf(
            InformationOne(
                name = R.string.name16,
                tribe = "래비래비족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「얏호~! 난 알렌이야!」",
                info = "꽃의 도시 플뢰르미아에 살고 있는 남자아이. 귀여운 척에 공주병이지만 예의는 바르게 윗사람을 추켜세워 부른다. 아양부리는 것이 특기. 루비를 싫어해서 자주 모함하려 든다. 형제애가 있고 그래서인지 여동생을 두고 있는 에메로드와는 사이가 좋다. 분홍색 동료인 체시카를 따르고 있다. 좋아하는 음식은 딸기."
            )
        )
    ),
    CharacterOne(
        title = R.string.title17,
        R.drawable.item17,
        information = listOf(
            InformationOne(
                name = R.string.name17,
                tribe = "라이라이족",
                tribeInfo = "test",
                gender = maleString,
                rank = rankString,
                word = "「무리야라이... 무서워라이...」",
                info = "강해지기 위해 여행을 떠나고 있는 남자아이. 라이트닝 라이더의 일원이지만, 겁이 많고 울보인지라 아즈마에게 자주 혼나는 편이다. 절체절명한 상황일 때에만 강력한 번개를 내려치게 할 수 있다. 말 끝에 [~라이] 라고 붙이는 것이 버릇. 좋아하는 음식은 새우튀김."
            )
        )
    ),
    CharacterOne(
        title = R.string.title18,
        R.drawable.item18,
        information = listOf(
            InformationOne(
                name = R.string.name18,
                tribe = "라이라이족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「딱히 나는, 주어진 임무를 수행할 뿐이다.」",
                info = "남몰래 영웅을 동경하고 있는 남자아이. 라이트닝 라이더라는 전대를 세웠고 그들의 리더이기도 하다. 쌍절곤에 번개를 두르고 싸운다. 얼핏 보면 쿨해 보이지만 전대 히어로의 열정은 누구에게도 뒤지지 않는다. 라이를 짐이라 여겨서 항상 타박하고 있다. 좋아하는 음식은 티라미수."
            )
        )
    ),
    CharacterOne(
        title = R.string.title19,
        R.drawable.item19,
        information = listOf(
            InformationOne(
                name = R.string.name19,
                tribe = "라이라이족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「흐아암... 졸려...」",
                info = "천진난만하고 항상 졸고 있는 듯한 인상의 남자아이. 구름을 만드는 것이 특기이며 언제나 구름 위에서 낮잠을 자고 있다. 싸움은 좋아하지 않지만 아즈마의 말에 어쩔 수 없이 라이트닝 라이더에 가담하고 있다. 이래 뵈도 아즈마보다 강하다. 좋아하는 음식은 마시멜로."
            )
        )
    ),
    CharacterOne(
        title = R.string.title20,
        R.drawable.item20,
        information = listOf(
            InformationOne(
                name = R.string.name20,
                tribe = "네코네코족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「...무슨 일이지?」",
                info = "무정하고 과묵한 웃지 않는 소녀. 텔레포트하는 마기를 가졌고 러시아냐 어딘가에 있는 거울나라 앨리스 월드에서 버섯과 약 연구를 하면서 만든 약을 팔아 생활하고 있다. 독서와 버섯 채집이 취미. 멜론빵과 민트초코를 좋아한다. 당근은 아주 싫어한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title21,
        R.drawable.item21,
        information = listOf(
            InformationOne(
                name = R.string.name21,
                tribe = "네코네코족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「앨리스! 그런 얼굴만 하지 말고 좀 웃어보라고!」",
                info = "러시아냐의 빈민가 그레이구스에서 태어난 청년. 트러블 메이커지만 낙관주의자. 어떤 연구의 피실험자가 되어 투명해지는 능력을 얻게 되었다. 그에 대한 후유증으로 기억력이 별로 없어서 다른 마케몬들의 이름을 기억하지 못하고 생김새로 부른다. 또 물을 싫어해서 목욕을 하지 않는다. 개다래 보드카와 껌을 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title22,
        R.drawable.item22,
        information = listOf(
            InformationOne(
                name = R.string.name22,
                tribe = "래비래비족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「안녕하세요. 거기있는 아가씨」",
                info = "벨츠에서 태어나 현재는 러시아냐에 살고 있는 수수께끼의 마술사. 거울 속에 가상세계를 만드는 능력을 가지고 있으며 항상 손거울을 들고 다닌다. 매우 신사적이지만 외로움을 잘 타고 천진난만한 일면도 있다. 우산은 마법의 지팡이로도 쓸 수 있다. 평소에는 양과자점 [Dolce]를 경영하고 있다. 앨리스 월드에서는 당근밭을 일구고 있으며 물론 좋아하는 음식은 당근이다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title23,
        R.drawable.item23,
        information = listOf(
            InformationOne(
                name = R.string.name23,
                tribe = "이누이누족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「세계의 모든 것을 보고 싶습니다.」",
                info = "고고학자라는 꿈을 가지고 마지리시아 각지를 돌아다니고 있는 소녀. 예의바르게 누구에게나 존대말로 말한다. 잘 속아 넘어가는 것이 옥의 티. 빨간 두건은 할머니로부터 받은 것. 잘하는 요리는 애플파이."
            )
        )
    ),
    CharacterOne(
        title = R.string.title24,
        R.drawable.item24,
        information = listOf(
            InformationOne(
                name = R.string.name24,
                tribe = "네코네코족",
                tribeInfo = "test",
                gender = femaleString,
                rank = rankString,
                word = "「다음은 천문학 수업임다!」",
                info = "솔시엘 마법학교에 갓 입학한 여자아이. 말 끝에 [~슴다, ~임다]를 붙이는 버릇이 있다. 귀여운 것과 천문학 수업을 좋아한다. 지팡이에서 별 모양의 빛을 내는 것 밖에 못한다. 취미는 별똥별 찾기. 좋아하는 음식은 잼빵."
            )
        )
    ),
    CharacterOne(
        title = R.string.title25,
        R.drawable.item25,
        information = listOf(
            InformationOne(
                name = R.string.name25,
                tribe = "래비래비족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「너도 마법사가 되기 위해 왔니?」",
                info = "마법사의 나라 소르시엘에서 태어난 여자아이. 일류 마법사가 되기 위해 소르시엘 마법학교에 다니고 있다. 빗자루를 타고 하늘을 나는 것은 잘하지만 그 외의 다른 공부는 못하는 편. 루루코와는 견원지간의 사이. 강경해서 모두를 조정하는 역할이지만 요리가 파멸적으로 서툴다. 계란요리를 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title26,
        R.drawable.item26,
        information = listOf(
            InformationOne(
                name = R.string.name26,
                tribe = "래비래비족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「흥, 이 문제를 당신이 풀 수 있을까?」",
                info = "마법사의 나라 소르시엘에서 태어난 여자아이. 부모님이 시킨대로 소르시엘 마법학교에 입학했다. 성적은 우수하지만 막상 실습에션 실패의 연속이다. 기가 세고 지는 것을 싫어하는 성격으로 자주 린과 싸운다. 주술학 교사인 벨리온에게 은밀히 연심을 품고 있다. 좋아하는 음식은 사탕."
            )
        )
    ),
    CharacterOne(
        title = R.string.title27,
        R.drawable.item27,
        information = listOf(
            InformationOne(
                name = R.string.name27,
                tribe = "헤비헤비족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「뭐 때문이라니? 복수하는 게 당연하잖아.」",
                info = "서양 드래곤을 봉인한 것으로 여겨지는 주술사의 혈통을 가진 소녀이며 니드를 계약 협상해 풀어준 장본인. 평소에는 웃음을 잃지 않지만 화를 내면 손을 쓸 수 없게 된다. 마법학교에 다니다가 중퇴하고 말았다. 사역마 니드를 거칠게 다루는 편. 여러가지 마물들을 구워먹는 것을 좋아한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title28,
        R.drawable.item28,
        information = listOf(
            InformationOne(
                name = R.string.name28,
                tribe = "드래드래족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「그게 너의 뜻이라면, 따르겠다.」",
                info = "오랫동안 봉인되었던 전설의 서양 드래곤. 굉장히 난폭하지만 머리가 좋아서 매사를 냉정하게 판단할 수 있다. 불을 뿜거나 작열하는 불꽃의 손톱을 조종하는 용의 기술이 자랑거리다. 봉인을 풀어준 라미아의 견공이나 다름없는 신세이며 할 수 없이 무엇이든 말을 들어준다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title29,
        R.drawable.item29,
        information = listOf(
            InformationOne(
                name = R.string.name29,
                tribe = "래비래비족",
                tribeInfo = "test",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「자신감이 없단 말이에요...」",
                info = "소르시엘 마법학교에서 교사로 일하고 있는 마법사. 공부에 전념하며 오랜 꿈이었던 기초 마법학 교사가 되었지만 부정적인 사고로 늘 실패를 두려워하고 있다. 시간강사 라피스와 사이가 좋지만 학생들에게 사랑받고 있는 그를 보고는 더욱 더 자신감이 떨어진다. 언제나 어깨 위에 자고 있는 것은 심부름꾼 정령 [돌미르]. 네코네코족을 싫어한다고 한다."
            )
        )
    ),
    CharacterOne(
        title = R.string.title30,
        R.drawable.item30,
        information = listOf(
            InformationOne(
                name = R.string.name30,
                tribe = "네즈네즈족",
                tribeInfo = "test",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「달이나 별은 거대한 마석이라고 해도 과언이 아닙니다.」",
                info = "소르시엘 마법학교에서 천문학 교사로 일하고 있는 마법사. 달과 별의 마력에 대해서 연구하고 있으며 밤에는 항상 천문대에 있다. 야무지고 완전무결하지만 학생보다 몸이 작은 것이 고민거리다. 마법석 모으기가 취미."
            )
        )
    )
)