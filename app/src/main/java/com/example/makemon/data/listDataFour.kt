package com.example.makemon.data

import com.example.makemon.R

data class InformationFour(
    val name : Int,
    val tribe: String,
    val gender: String,
    val rank: String,
    val word: String,
    val info: String
)

data class CharacterFour(
    val title: Int,
    val image: Int,
    val information: List<InformationFour>
)

var listDataFour = listOf(
    CharacterFour(
        title = R.string.title91,
        R.drawable.item91,
        information = listOf(
            InformationFour(
                name = R.string.name91,
                tribe = "페네페네족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「페넨스에 영원한 빛을..」",
                info = "예술과 빛의 향 페넨스를 다스리는 왕으로 [팔레트 왕]으로써 국민들에게 총애를 받고 있다. 페인과 팅의 아버지이기도 하고 평소에는 익살스럽지만 아들들에게는 엄격하다. 페인을 항상 혼내기 일쑤."
            )
        )
    ),
    CharacterFour(
        title = R.string.title92,
        R.drawable.item92,
        information = listOf(
            InformationFour(
                name = R.string.name92,
                tribe = "페네페네족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「페인, 팅. 이리로 오너라..」",
                info = "예술과 빛의 향 페넨스의 왕비. 페인과 팅의 어머니이기도 하고 온화하고 상냥한 성격. 꽃의 마법이 특기다. 팅과 마찬가지로 막대한 마력을 모으는 마기를 지녔지만 몸이 너무 약하다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title93,
        R.drawable.item93,
        information = listOf(
            InformationFour(
                name = R.string.name93,
                tribe = "페네페네족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「페, 페인님! 기다려주세요!」",
                info = "페넨스 궁전의 집사를 맡고 있는 청년...으로 보이지만 어떤 저주로 인해 불사신의 몸을 얻고 수백년을 살아왔다. 페넨스 궁전의 왕자의 집사를 대대로 맡아와 모든 것을 알고 있다. 온후하고 친화적이며 아픈 것을 싫어한다. 페인과 팅과는 사이가 좋다. 좋아하는 음료는 커피."
            )
        )
    ),
    CharacterFour(
        title = R.string.title94,
        R.drawable.item94,
        information = listOf(
            InformationFour(
                name = R.string.name94,
                tribe = "로바로바족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「리리카, 너 뭐 하는 거야?」",
                info = "마지리시아에서 유명한 패션 브랜드 [SAVANNA]의 창설자인 일류 디자이너. 성실하고 완벽주의, 누구에게나 너라고 부른다. 냉정하고 침착한 성격이지만, 아저씨라고 불리면 노골적으로 분노의 감정을 가라앉히려는 모습을 보인다. 치근덕대는 리리카를 짜증나게 생각하고 있지만 자신과는 다른 틀에 얽매이지 않는 디자인 센스는 인정하고 있다. 채식주의자다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title95,
        R.drawable.item95,
        information = listOf(
            InformationFour(
                name = R.string.name95,
                tribe = "기린기린족",
                gender = femaleString,
                rank = rankString,
                word = "「시마양은 너무 딱딱해보여~ ㅎ... 즐겁게 해보자구~요!」",
                info = "언제나 기분이 좋은 갸루소녀. 뿔 때문인지 자신은 우주에서 왔다고 믿고 있다. 마법은 잘 못하지만 데코레이션은 자신있다. 곧바로 별명을 붙여 부르는 버릇이 있어서 선배인 제브르를 [시마양]이라고 부르고 있다. 좋아하는 음식은 파르페."
            )
        )
    ),
    CharacterFour(
        title = R.string.title96,
        R.drawable.item96,
        information = listOf(
            InformationFour(
                name = R.string.name96,
                tribe = "페네페네족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「어머, 올리브 밭에는 무슨 일로 오셨나요?」",
                info = "페넨스에서 올리브 밭을 가꾸고 있는 소녀. 키운 올리브는 대부분 나폴리오에서 소비되고 있다. 올리브에 대한 집착이 굉장해서 올리브를 이용한 요리도 한다. 먹지 않으면 웃는 얼굴로 입에 쑤셔넣는다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title97,
        R.drawable.item97,
        information = listOf(
            InformationFour(
                name = R.string.name97,
                tribe = "네즈네즈족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「메리 크리스마스... 에요!」",
                info = "크리스마스용 마법도구를 취급하는 가게에서 일하고 있는 소녀. 빛의 마법으로 거리를 조명으로 장식하는 것이 취미. 크리스마스 이외의 비수기를 어떻게 보내야 할 지 고민중이다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title98,
        R.drawable.item98,
        information = listOf(
            InformationFour(
                name = R.string.name98,
                tribe = "리스리스족",
                gender = femaleString,
                rank = rankString,
                word = "「꼬... 꼬리는 만지지 말아주세요!」",
                info = "프랭탕 지방의 메르데 마을에서 태어난 소녀. 나무열매를 주우면서 생활하고 있다. 마법 학교에 다니는 것이 꿈이며 마법서를 사기 위해 열심히 일하고 있다. 목욕하는 것이 취미이며, 좋아하는 음식은 도토리빵."
            )
        )
    ),
    CharacterFour(
        title = R.string.title99,
        R.drawable.item99,
        information = listOf(
            InformationFour(
                name = R.string.name99,
                tribe = "우르우르족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「오랜만이네~ 가우루~ 좋은 남자가 되어버려서~ 아쉽게 되었어.」",
                info = "리코폴리스에 살고 있는 족집게로 소문난 점쟁이. 제 3의 눈으로 미래를 보는 마기를 가졌다. 돈과 보석에는 사족을 못 쓴다. 마술솜씨는 일류지만 안타깝게도 크나큰 쇼타콘으로 후우가가 귀여워서 어쩔 수가 없다고 한다. 가우루스를 놀려먹으며 노는 것이 취미. 술은 특히 칵테일을 좋아한다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title100,
        R.drawable.item100,
        information = listOf(
            InformationFour(
                name = R.string.name100,
                tribe = "우파우파족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「좋은 마석이 입고됐어요~」",
                info = "알라바타의 수도 보석의 도시 자우하라에서 마석상을 경영하고 있는 소년. 하늘을 나는 양탄자와 같은 방법으로 정제된 목도리는 공중부양이 가능한 일급품이자 보물. 빛나는 것을 좋아하고 돈에 민감하다. 비올라와 사이가 좋으며 좋아하는 음식은 카레."
            )
        )
    ),
    CharacterFour(
        title = R.string.title101,
        R.drawable.item101,
        information = listOf(
            InformationFour(
                name = R.string.name101,
                tribe = "우르우르족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「거기 당신, 리코폴리스로 향하는 것인가.」",
                info = "늑대의 도시 리코폴리스 출신 사바라 사막의 수호자 겸 안내인. 제 3의 눈으로 올바른 길을 볼 수 있는 마기를 가졌다. 모래를 조종해 폭풍를 일으키는 마법을 특기로 삼고 있다. 버드버드족에게 원한을 품고 있으며, 하르퓌아와의 교역을 싫어한다. 좋아하는 음식은 상추 샐러드."
            )
        )
    ),
    CharacterFour(
        title = R.string.title102,
        R.drawable.item102,
        information = listOf(
            InformationFour(
                name = R.string.name102,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「여기가 가쥬마루 숲이래요!」",
                info = "류큐 왕국의 수호신으로 추앙받고 있는 가쥬마루 숲 속에 사는 수호신. 이누이누족이나 라이라이족, 오니의 피를 이어받은 용. 장난을 좋아한다. 이렇게 보여도 수백년째 살아오고 있는 것 같다. [~래요]가 말버릇이다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title103,
        R.drawable.item103,
        information = listOf(
            InformationFour(
                name = R.string.name103,
                tribe = "류우류우족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「오빠~ 침입자가 나타났대요!」",
                info = "류큐 왕국의 수호신으로 추앙받고 있는 가쥬마루 숲 속에 사는 수호신. 시시니라이의 쌍둥이 여동생으로 오빠를 사랑하고 있으며 언제나 함께한다. [~대요]가 말버릇이다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title104,
        R.drawable.item104,
        information = listOf(
            InformationFour(
                name = R.string.name104,
                tribe = "이누이누족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「모니야~ 오구오구~ 귀여워라~」",
                info = "솔레유에서 태어난 모니니 브리더. 그 솜씨는 으뜸이며 그런 상냥한 품 안에서 자라나는 모니니는 매우 선하다. 그림그리기와 아이들을 달래주는 것이 특기. 노란색에 강한 애착을 지니고 있어서 노란 것을 많이 가지고 있다. 좋아하는 음식은 콘도그."
            )
        )
    ),
    CharacterFour(
        title = R.string.title105,
        R.drawable.item105,
        information = listOf(
            InformationFour(
                name = R.string.name105,
                tribe = "치라치라족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「토마니임~♥ 디온니임~♥」",
                info = "차오파나 태생의 어린(나이사칭) 소녀. 보석을 아주 좋아하며 자우하라에 살고 있는 마법도구점 '우셔스 암리타'에서 보석을 단 귀여운 콤팩트를 만들어 팔고 있다. 디온와 토마를 아주 좋아하고 하르퓌아로부터 배로 교역할 때 스토킹하고 있다. 귀여운 여자아이도 너무 좋아하며, 좋아하는 음료는 우유."
            )
        )
    ),
    CharacterFour(
        title = R.string.title106,
        R.drawable.item106,
        information = listOf(
            InformationFour(
                name = R.string.name106,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「해피! 당근 케이크는 아직이야~?」",
                info = "하르퓌아에 살고 있는 천사의 피를 이어받은 소녀. 날개가 달려있기는 하지만 잘 날진 못한다. 점프는 잘 하는 편. 해피와 사이가 좋아서 언제나 둘이서 논다. 대식가로 해피가 만든 음식을 먹는 것을 정말 좋아한다. 좋아하는 음식은 당근 케이크."
            )
        )
    ),
    CharacterFour(
        title = R.string.title107,
        R.drawable.item107,
        information = listOf(
            InformationFour(
                name = R.string.name107,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「참 맛있게 구워졌어♪」",
                info = "하르퓌아에 살고 있는 천사의 피를 이어받은 소녀. 맞춘 상대끼리 사랑에 빠지는 사랑의 화살을 쏠 수 있지만 아직 연습 중이다. 평소에는 편지 배달원으로 일한다. 과자 만들기가 취미이며, 슈가에게 먹여주는 것을 좋아한다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title108,
        R.drawable.item108,
        information = listOf(
            InformationFour(
                name = R.string.name108,
                tribe = "사루사루족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「와오! 대형 특종을 발견했다...!!」",
                info = "오늘도 내일도 특종을 쫒아다니는 신문기자. 마지리시아 전 국토에서 [아르캉 타임즈]를 발행하고 있다. 매사에 열심이 임하지만 말만 번지르르하다. [와오!]가 말버릇. 도망치는 것만은 빠르다. 아버지로부터 물려받은 카메라를 소중히 여기고 있다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title109,
        R.drawable.item109,
        information = listOf(
            InformationFour(
                name = R.string.name109,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「하등 민족따위가, 웃기는 소리 마라.」",
                info = "토리토리족의 섬나라 하르퓌아 제도의 왕. 마그마를 조종하는 마법을 구사하여 화산을 분화시켜 섬의 영토를 넓히고 있다. 작열의 토마라는 이명을 가지고 권력을 휘두르며 반항하는 자는 혈연자일지라도 처리한다. [래프터]라고 불리는 왕족의 원조다. 좋아하는 음식은 카레."
            )
        )
    ),
    CharacterFour(
        title = R.string.title110,
        R.drawable.item110,
        information = listOf(
            InformationFour(
                name = R.string.name110,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「토마님~! / 섬에 큰일이 벌어졌어요!」",
                info = "토리토리족의 섬나라 하르퓌아 제도 태생의 형제. 토마를 동경하고 있어서 형님이라고 부르며 따르기는 하지만 좋은 수단으로 쓰이고 있으며 섬의 정보를 모으기 위해 항상 날아다니고 있다. 별명은 카푸/케푸. 호두 등의 견과류를 매우 좋아한다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title111,
        R.drawable.item111,
        information = listOf(
            InformationFour(
                name = R.string.name111,
                tribe = "네코네코족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「정말이지... 나는 일 때문에 왔다니까.」",
                info = "러시아냐에서 태어난 소녀. 머리도 좋고 평상시엔 모델로 일하지만 현재는 하르퓌아의 복잡한 생태계를 조사하고 있다. 항상 토마에게 구혼당하고 있지만 그럴 때마다 거절하고 있다. 좋아하는 음식은 밀푀유."
            )
        )
    ),
    CharacterFour(
        title = R.string.title112,
        R.drawable.item112,
        information = listOf(
            InformationFour(
                name = R.string.name112,
                tribe = "라이라이족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「넌 위험하니까 내려가 있도록.」",
                info = "하르퓌아에서 태어난 그리폰 청년. 극히 성실하고 견실한 사람. 악력이 굉장히 강해서 그 힘은 두개골도 분쇄해버릴 정도다. 과거 토마와는 앙숙이었지만 현재는 내버려두지 않고 늘 감시의 눈을 번뜩이며 잔소리하고 있다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title113,
        R.drawable.item113,
        information = listOf(
            InformationFour(
                name = R.string.name113,
                tribe = "토리토리족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「너희들, 유적 쪽으로 가서는 안 된다고 그렇게 말했지.」",
                info = "하르퓌아 제도에 물자를 보내는 [붉은부리갈매기편]이라 불리는 운반책을 맡고 있다. 매사에 진지하고 여장부적이다. 괭이갈매기 남매의 알을 주워온 장본인이기도 하며 어머니와도 같은 존재다. 둘을 소중히 여기고 있지만, 당근과 채찍인 면도 많아 자주 꾸짖기도 한다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title114,
        R.drawable.item114,
        information = listOf(
            InformationFour(
                name = R.string.name114,
                tribe = "토리토리족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「시이~!! 설마 너 겁먹은 거야? 어서 가라구!」",
                info = "[괭이갈매기편]이라 불리는 운반책을 남동생인 시이와 같이 맡고 있다. 카자나기를 [나기 언니]라고 부르며 사모하고 있다. 밝고 견실하며. 호기심이 많아서 전 세계를 날아다니는 것이 꿈이다. 카자나기와 닮아서 동생을 선도하는 탄탄한 일면도 지니고 있다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title115,
        R.drawable.item115,
        information = listOf(
            InformationFour(
                name = R.string.name115,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「음냐... 좀 더 자게 해줘~」",
                info = "[괭이갈매기편]이라 불리는 운반책을 누나인 멜과 같이 맡고 있다. 누나와는 정 반대로 귀찮은 구석이 많으며 가게에서 항상 일을 빼먹었다가 카자나기에게 혼나기 일쑤. 마이페이스로 낮잠이 취미. 사물을 분별하는 데에는 능숙하고 누나의 지나친 행동을 억제하는 일이 많다. 먹이를 길들이는 씨캣들과는 사이가 좋은 편. 참치를 좋아한다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title116,
        R.drawable.item116,
        information = listOf(
            InformationFour(
                name = R.string.name116,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「코노하, 여기서 기다려줄 수 있겠어?」",
                info = "버드버드족의 섬나라 하르퓌아의 [낮의 문지기]인 부엉이. 두뇌회전이 빠르고 착실해서 주변의 동족들로부터 사랑받고 있다. 여동생 코노하를 매우 소중히 여기고 있다. 수공예가 취미로 하오리와 같은 것들이나 드림캐쳐를 자주 만들고 있다. 일을 빼먹는 이브의 감시도 게을리하지 않는다. 좋아하는 음식은 생선구이."
            )
        )
    ),
    CharacterFour(
        title = R.string.title117,
        R.drawable.item117,
        information = listOf(
            InformationFour(
                name = R.string.name117,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「어이, 거기 네 녀석, 잡아먹히고 싶어?」",
                info = "토리토리족의 섬나라 하르퓌아의 [밤의 문지]인 올빼미. [짐승먹이 새]라는 이명을 지니고 있으며 이 녀석이 한번 노린 자는 살아 돌아올 수 없다고 한다. 말솜씨가 없고 말버릇은 [잡아먹어 버린다]. 이 때문에 주변의 동족들로부터 두려움을 받고 있다. 낮에는 항상 잠을 자고 있다. 아버지인 토마를 너무나도 싫어한다."
            )
        )
    ),
    CharacterFour(
        title = R.string.title118,
        R.drawable.item118,
        information = listOf(
            InformationFour(
                name = R.string.name118,
                tribe = "토리토리족",
                gender = femaleString,
                rank = rankString,
                word = "「오빠, 또 코노에게 그림책 읽어줘.」",
                info = "토리토리족의 섬나라 하르퓌아 제도 태생의 소쩍새 여자아이. 너무나도 부끄럼이 많아서 금방 수풀에 숨어버린다. 형제 중에서는 미지크를 제일 잘 따르고 있으며 항상 뒤를 따라다니곤 한다. 그림책 읽는 것을 좋아해서 언젠가는 그림책 속에서 보았던 섬 밖으로 나가서 마법을 쓰는 것이 꿈이다. 좋아하는 음식은 애벌레와 지렁이."
            )
        )
    ),
    CharacterFour(
        title = R.string.title119,
        R.drawable.item119,
        information = listOf(
            InformationFour(
                name = R.string.name119,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「거기 있는 행인씨, 연어라도 먹을래?」",
                info = "버드버드족의 섬나라 하르퓌아 제도 래프터 일족의 차남. 과묵하고 잠이 많다. 자신의 날개깃으로 화살을 만들고 활쏘기로 물고기를 잡는 일이 취미로 자주 강가에 간다. 나는 것은 그리 좋아하지 않는다. 미지크와 이브올의 좋은 이해관계로 상담도 해준다. 좋아하는 음식은 연어."
            )
        )
    ),
    CharacterFour(
        title = R.string.title120,
        R.drawable.item120,
        information = listOf(
            InformationFour(
                name = R.string.name120,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「내 눈에서 벗어날 생각은 하지 않는 것이 좋을거다.」",
                info = "토리토리족의 섬나라 하르퓌아 제도에 있는 랩터의 민족을 아우르는 독수리. 형제 중에서 가장 연장자이며 가장 뛰어난 시력을 가졌으며 5km 앞의 사냥감도 놓치지 않는다. 왕이자 아버지인 토마의 명령은 절대적으로 따른다. 자연으로부터 창을 만들어내는 능력을 지니고 있다. 평상시에는 가면을 쓰고 맨얼굴도 보여주지 않는다. 일이 없는 시간에는 그림을 그리는 것이 취미인 일면도 가지고 있다."
            )
        )
    )
)