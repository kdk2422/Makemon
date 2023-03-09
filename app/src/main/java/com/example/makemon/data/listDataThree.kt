package com.example.makemon.data

import com.example.makemon.R

data class InformationThree(
    val name: Int,
    val tribe: String,
    val gender: String,
    val rank: String,
    val word: String,
    val info: String
)

data class CharacterThree(
    val title: Int,
    val image: Int,
    val information: List<InformationThree>
)

var listDataThree = listOf(
    CharacterThree(
        title = R.string.title61,
        R.drawable.item61,
        information = listOf(
            InformationThree(
                name = R.string.name61,
                tribe = "타누타누족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「어서오세요. 새로운 두루마리가 들어왔어요.」",
                info = "야마토국에서 요술 두루마리를 집필하고 있는 여자아이. 두루마리 가게 [분부쿠 문서]의 간판 아가씨이며 요술은 아직 수행중... 머리의 잎새는 대대로 전해지는 마력이 깃든 잎이며 요술에 의지하지 않고 태화도를 사용해 싸운다. 예의바르게 경어를 쓰는 경우가 많지만, 조금 천진난만한 면도 있다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title62,
        R.drawable.item62,
        information = listOf(
            InformationThree(
                name = R.string.name62,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「짐이 따분하니 어디 재미있는 재주라도 부려보거라.」",
                info = "야마토국의 야마노미아의 공주. 외모가 아름다운 대신 귀찮아서 집에서 게으름을 피우고 있다. 래비래비족만을 사로잡는 마기를 가지고 권력을 얻었다. 돈에 인색해서 하인들에게 이것저것 시켜서 돈을 벌려고 계획하고 있다. 좋아하는 음식은 달맞이 경단."
            )
        )
    ),
    CharacterThree(
        title = R.string.title63,
        R.drawable.item63,
        information = listOf(
            InformationThree(
                name = R.string.name63,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「저기... 거기 계신 당신...」",
                info = "야마토의 땅을 방황하는 오니의 피를 이어받은 여자아이. 눈의 요술이 특기이며 마력과 융합되어 있는 그 영혼에 닿으면 서늘해지는 수수께끼가 많은 인물."
            )
        )
    ),
    CharacterThree(
        title = R.string.title64,
        R.drawable.item64,
        information = listOf(
            InformationThree(
                name = R.string.name64,
                tribe = "사루사루족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「소우마, 수행하자구!」",
                info = "차오파나에 있는 하나하테산 태생의 소년. 어느 날 만난 청룡 소우마와 함께 산 속에서 선술 수행을 하고 있다. 자신의 분신을 만들거나 여의봉을 길게 펼칠 수 있다. 여의봉 안에는 근두운이 내장되어 있지만 아직 잘 다루지 못한다. 개구쟁이며 호기심이 왕성, 싸움을 빠르게 벌인다. 소번정의 메이화에게 몰래 연심을 품고 있다. 차오파나 요리와 바나나를 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title65,
        R.drawable.item65,
        information = listOf(
            InformationThree(
                name = R.string.name65,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「계속, 이런 날이 이어졌으면 좋겠다.」",
                info = "하나하테산에서 깊게 숨어살던 청룡. 낯가림으로 조심스러운 성격이지만 유일하게 호의를 가지고 있는 하야토에게 마음을 주고 있다. 날씨를 다루는 용의 기운을 가지고 있으며 손에서는 엄청난 에너지의 파동을 낼 수 있다. 고향인 용의 고을에는 돌아가고 싶지 않은 모양이다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title66,
        R.drawable.item66,
        information = listOf(
            InformationThree(
                name = R.string.name66,
                tribe = "네코네코족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「츄츄! 가보자고!」",
                info = "차오파나에서 태어난 소녀. 하야토를 라이벌로 삼고 있으며 매일같이 전투를 벌이고 있다. 좋아하는 음식은 복숭아만쥬. 마오의 사역마 요정, 츄츄는 말솜씨가 없어서 [~습니다요]로 말로 끝내는 것이 입버릇이다. 주인을 [마오니뮤]라며 사모하고 있다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title67,
        R.drawable.item67,
        information = listOf(
            InformationThree(
                name = R.string.name67,
                tribe = "쿠마쿠마족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「쿈, 무슨 일이던간에 포기하면 안된다.」",
                info = "쿈의 스승으로써 권법을 가르치고 있는 차오파나 태생의 소녀. 엄격한 작은아버지의 지도에 의해 작은 몸에도 불구하고 권법의 달인이 되었다. 말투도 삼촌의 영향으로 [~다, ~나, ~까]로 끝마치는 버릇이 있다. 사실은 요괴가 질색이다. 메이화 밑에서 신세를 지고 있어서 가게를 돕는 일도 많다. 좋아하는 음식은 행인두부."
            )
        )
    ),
    CharacterThree(
        title = R.string.title68,
        R.drawable.item68,
        information = listOf(
            InformationThree(
                name = R.string.name68,
                tribe = "콩콩족",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「으으... 난 해낼 수 있을까...?」",
                info = "샤오샨의 제자로써 권법을 배우고 있는 청년. 살아있었을 때의 기억이 없는 강시의 다른 뜻을 잘못 이해해서 스승에게 쿈이라고 명명되었다. 샤오샨에게 [샤오씨]라고 부르며 사모하고 있다. 병약해서 늘 몸이 안 좋아 보인다. 무서운 것은 딱 질색이다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title69,
        R.drawable.item69,
        information = listOf(
            InformationThree(
                name = R.string.name69,
                tribe = "시카시카족",
                gender = "?",
                rank = "$rankString$rankString",
                word = "「샤오양, 밥 좀 먹을래?」",
                info = "차오파나 푸알 거리에서 [소번정]이라는 차오파나 음식점을 운영하고 있다. 샤오샨과 쿈과는 같이 살고 있고 종종 가게를 거들어주곤 한다. 샤오샨을 [샤오양(シャオちゃん)]이라고 부르며 맹목적으로 사랑하고 있다. 화를 내면 무서워지는 듯 하다. 성별에 대한 것은 언급하지 않는 편이 좋다고... 해야하나? 차오파나 차를 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title70,
        R.drawable.item70,
        information = listOf(
            InformationThree(
                name = R.string.name70,
                tribe = "사루사루족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「힛힛히! 오늘이야말로 네녀석을 잡아내고 말테다!」",
                info = "하야토의 분신으로부터 격리되어 태어나 본체을 잡아내려 하고 항상 앞길을 막고 있는 소년. 하야토 본인과 능력은 같지만 성격은 교활하고 나쁜 짓을 하는 것을 좋아한다. 자신을 만들어낸 도사에게 충성을 맹세하고 있다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title71,
        R.drawable.item71,
        information = listOf(
            InformationThree(
                name = R.string.name71,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「부모님처럼, 네놈도 죽거라.」",
                info = "소우마의 친형인 청룡. 자신들 용의 일족을 자랑스럽게 생각하고 있으며 자존심이 강해 류우류우족 이외의 종족을 하급민족이라 부르며 많은 종족들에게 원한을 품고 있다. 날씨를 다루는 용의 기운을 구사하여 싸운다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title72,
        R.drawable.item72,
        information = listOf(
            InformationThree(
                name = R.string.name72,
                tribe = "헤비헤비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「뭐야 넌, 빨리 죽어서 메무의 부하가 되라고.」",
                info = "소르시엘에 사는 고집불통에 기센 공주님. 언제나 자신의 마기 네크로맨싱으로 시체로부터 만들어낸 부하 좀비들을 거느리고 있다. 평상시에는 새초롬하지만 페인 앞에만 있으면 부끄럼을 타버린다. 악마의 날개가 자라나 있지만 날 수는 없다. 소르시엘 마법학교의 학생이기도 하며 성적은 우수. 좋아하는 음식은 푸딩."
            )
        )
    ),
    CharacterThree(
        title = R.string.title73,
        R.drawable.item73,
        information = listOf(
            InformationThree(
                name = R.string.name73,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「그것은... 사랑이군요! 사랑이 이루어지기를!」",
                info = "소르시엘에서 마법도구점을 경영하고 있는 소녀. 온후하고 상냥하며 싸움을 싫어하고, 솔직하고 온화한 천사같은 성격. 사랑은 멋지다고 생각하는 박애주의자이며, 때로는 전혀 관계없는 일이더라도 사랑과 연관짓기도 한다. 좋아하는 음식은 마카롱."
            )
        )
    ),
    CharacterThree(
        title = R.string.title74,
        R.drawable.item74,
        information = listOf(
            InformationThree(
                name = R.string.name74,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「우후후... 귀엽게 만들어졌어.」",
                info = "조용하고 마음이 여린 소녀. 언제나 곤란한 얼굴을 하고 몹시 부끄러움이 많다. 말하는 것이 서툴러서 웅얼웅얼 말한다. 그림자를 꿰매는 마기를 가져서 마법바늘로 다양한 기술을 부린다. 바느질이 취미로 인형을 많이 만들고 있다. 인형으로 된 놀이공원 그루미랜드를 만든 장본인."
            )
        )
    ),
    CharacterThree(
        title = R.string.title75,
        R.drawable.item75,
        information = listOf(
            InformationThree(
                name = R.string.name75,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「민트초코... 좋아하니?」",
                info = "솔시에의 유명한 초콜릿 가게 [쇼콜라뉴]를 쇼콜란티느와 경영하고 있는 쇼콜라티에. 진지하고 견실하긴 하지만 종잡을 수 없는 성격이기도 하다. 귀여운 잡화를 모으는 것과 여자아이를 좋아한다. 민트를 [치약]이라고 부르는 녀석만은 절대로 용서하지 못한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title76,
        R.drawable.item76,
        information = listOf(
            InformationThree(
                name = R.string.name76,
                tribe = "이누이누족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「발렌타인데이엔 바쁘다구요!」",
                info = "솔시엘의 유명한 초콜릿 가게 [쇼콜라뉴]를 민티와 경영하고 있는 쇼콜라티에. 친정이 부잣집이어서 아가씨 말투로 말한다. 낯을 가려서 언제나 뾰루퉁하지만 민티의 말은 듣는다. 민티한테는 [쇼콜란]이라고 불리고 있다. 마법과 피망은 질색이다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title77,
        R.drawable.item77,
        information = listOf(
            InformationThree(
                name = R.string.name77,
                tribe = "네코네코족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「알아냈습니다! 범인은... 당신인거죠!」",
                info = "벨츠에 살고 있는 자칭 탐정 소녀. 명탐정 샬롯 홈즈의 소설에 감화되어 일류 탐정을 동경하고 있지만 덜렁대서 오히려 사건을 일으키는 일도 종종. 귀가 아주 밝아서 청각을 사용하는 수색은 자신만만하다. 밀크티를 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title78,
        R.drawable.item78,
        information = listOf(
            InformationThree(
                name = R.string.name78,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「저, 저의 모습이 보여요?」",
                info = "겁이 많은 유령 여자아이. 평소엔 무덤에서 잠자고 있지만 할로윈 때가 오면 소르시엘 마을에 놀러가게 된다. 울보라서 언제나 불안한듯한 얼굴을 하고 있다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title79,
        R.drawable.item79,
        information = listOf(
            InformationThree(
                name = R.string.name79,
                tribe = "샤프샤프족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「...졸음이 쏟아져오는 거니?」",
                info = "언제나 졸린듯한 모습을 하고 있는 여자아이. 온화하고 차분한 성격. 몸이 약해서 언제나 방에 틀어박혀 있다. 잠의 마기를 가지고 있서 근처에만 있어도 졸음이 쏟아진다. 자신의 양털을 써서 뜨개질을 하는 것이 취미. 오르골 음색과 핫밀크를 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title80,
        R.drawable.item80,
        information = listOf(
            InformationThree(
                name = R.string.name80,
                tribe = "콩콩족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「린... 또 루루코랑 싸웠어?」",
                info = "마법사의 나라 소르시엘 태생의 소녀. 남들을 잘 돌봐주는 샹냥한 마음의 소유자. 소르시엘 마법학교 시절은 린과 같은반 동기로 소리와 빛의 마법이 특기다. 피아노를 연주하는 것이 취미. 좋아하는 음식은 크림빵."
            )
        )
    ),
    CharacterThree(
        title = R.string.title81,
        R.drawable.item81,
        information = listOf(
            InformationThree(
                name = R.string.name81,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「쿠로리아~!! 키라라 배고파~!!」",
                info = "어느 쇠퇴한 나라의 공주님. 제멋대로인 성격. 마법은 전반적으로 서툴지만 유일하게 빛 마법을 특기로 하고 있다. 여자를 좋아해서 언제나 귀여운 모습을 보이고 있다. 자신의 호위를 맡고 있는 쿠로리아를 좋아한다. 항상 배고프고 쿠로리아가 만드는 계란요리를 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title82,
        R.drawable.item82,
        information = listOf(
            InformationThree(
                name = R.string.name82,
                tribe = "네코네코족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「키라라님, 잠시 기다려 주세요.」",
                info = "키라라의 보디가드를 맡고 있는 고양이. 과묵하고 용감한 성격. 선천적으로 눈이 좋지 않아서 언제나 무기로 다뤄온 지팡이를 가지고 다닌다. 체스나 오셀로 등의 보드 게임을 잘한다. 옷을 즐겨 입지는 않지만 키라라의 옷입히기 인형이 되었다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title83,
        R.drawable.item83,
        information = listOf(
            InformationThree(
                name = R.string.name83,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「그 원피스가 어울리네요!」",
                info = "소르시엘의 양복점에서 일하고 있는 디자이너 여인. 유행에 민감한 멋쟁이. 사탕을 좋아해서 항상 가지고 다닌다. 영감을 얻기 위해 여행을 가는 것이 취미."
            )
        )
    ),
    CharacterThree(
        title = R.string.title84,
        R.drawable.item84,
        information = listOf(
            InformationThree(
                name = R.string.name84,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「단지 환자를 돕는 일에서 삶의 의미를 찾을 뿐이다.」",
                info = "러시아냐에서 태어난 마법약술사 겸 외과의사. 의술 솜씨는 일류지만 인상이 나빠서 꺼려지고 수상쩍다고 돌팔이 의사라고 불리는 일도 종종 생긴다. 그러나 환자들로부터 열렬한 신뢰를 받고 있고 특히 아이들이 좋아한다. 담배와 블랙커피를 좋아하지만 매일 카페인 과잉섭취로 불면증에 시달리고 있다. 라피스와는 소꿉친구. 병아리 굿즈를 모으고 있다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title85,
        R.drawable.item85,
        information = listOf(
            InformationThree(
                name = R.string.name85,
                tribe = "우시우시족",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「사피르 형니임~!! 멋있다구요~!!」",
                info = "야무진 성격이지만 순수한 마음을 가지고 있으며 빅스타가 되는 게 꿈이다. 인기인인 사피르를 동경하며 형님이라 부르며 사모하고 있지만 사피르에게는 적당한 부하로밖에 생각되지 않는다. 의외로 예의가 바르고 [~구요]로 끝마치는 게 입버릇이다. 좋아하는 음식은 햄버거."
            )
        )
    ),
    CharacterThree(
        title = R.string.title86,
        R.drawable.item86,
        information = listOf(
            InformationThree(
                name = R.string.name86,
                tribe = "래비래비족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「그 무기, 좀 구경하면 안될까?」",
                info = "무기와 방어구의 제조, 수리, 유지보수를 하며 일하고 있는 검은 토끼 소년. 무기 덕후여서 무기를 보면 눈이 반짝 빛난다. 아직까지 수행중이긴 하지만 마석을 이용한 강력한 무기를 정제하는 것이 특기다. 장난기로 쓸데없는 기능을 넣을 때가 많다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title87,
        R.drawable.item87,
        information = listOf(
            InformationThree(
                name = R.string.name87,
                tribe = "그늘그늘족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「거기 누님, 잠깐 저의 재주좀 보고 가셔요~」",
                info = "팬터마임을 잘하는 소년. 보이지 않는 장벽을 치는 마기를 가졌고 흡착성이 매우 높은 발가락으로 그 장벽을 타고 올라가는 것을 팬터마임처럼 보이게 하고 있다. 관객들을 누님이라고 부르는 경우가 많고 앨리스와도 가까워지려고 하기 때문에 같은 줄무늬에 거리에서 공연을 하고 있는 체시카에게는 라이벌로 여겨지고 있다. 좋아하는 음식은 계란 요리."
            )
        )
    ),
    CharacterThree(
        title = R.string.title88,
        R.drawable.item88,
        information = listOf(
            InformationThree(
                name = R.string.name88,
                tribe = "네코네코족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「너는 맑은 마음을 가지고 있구나.」",
                info = "영혼의 샘물을 수호하는 소년. 어릴 적부터 영혼의 모습을 볼 수 있었고 영혼의 샘에서 헤메다가 줄곧 그곳에서 살고 있다. 특유의 기질로 정령과 요정들로부터 사랑받고 있다. 피터의 짝꿍 요정은 페어리벨이라는 소녀로, 애칭은 벨벨. 마음씨 좋은 피터를 너무나도 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title89,
        R.drawable.item89,
        information = listOf(
            InformationThree(
                name = R.string.name89,
                tribe = "래비래비족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「레모누나...이런 실험은 하지 말자...」",
                info = "누나인 레몬의 조수를 맡고 있는 소년. 그러나 언제나 실험체 신세를 지고 있다. 말 끝에는 [~레스]를 붙이는 버릇이 있다. 유약한 성격으로 늘 벌벌 떨고 있다. 레몬스쿼시를 좋아한다."
            )
        )
    ),
    CharacterThree(
        title = R.string.title90,
        R.drawable.item90,
        information = listOf(
            InformationThree(
                name = R.string.name90,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「좋아... 아주 좋아!」",
                info = "시트론 연구소에서 여러가지 연구를 하고 있는 박사. 고집이 센 성격으로 빈번히 이상한 약을 발명하기도 한다. 케몬클루스를 보면 잡아서 해부하려고 한다. 레모네이드를 좋아한다. 레스카에게는 [레모누나]라고 불린다."
            )
        )
    )
)