package com.example.makemon.data

import com.example.makemon.R

data class InformationFive(
    val name: Int,
    val tribe: String,
    val gender: String,
    val rank: String,
    val word: String,
    val info: String
)

data class CharacterFive(
    val title: Int,
    val image: Int,
    val information: List<InformationFive>
)

var listDataFive = listOf(
    CharacterFive(
        title = R.string.title121,
        R.drawable.item121,
        information = listOf(
            InformationFive(
                name = R.string.name121,
                tribe = "우오우오족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「언니들은... 육지의 세계로 가버렸어요.」",
                info = "머멜리아 해국에서 태어난 허약한 머메이드 자매의 삼녀. 노래를 부르는 것은 정말 좋아하지만 자신감이 별로 없다. 들은 자를 회복시키는 힘이 있는 마법의 노랫소리를 부를수있고 바다의 마녀에게 노려지고 있다. 마녀의 먹잇감이 된 언니들을 걱정하고 있다. 좋아하는 음식은 해조 샐러드."
            )
        )
    ),
    CharacterFive(
        title = R.string.title122,
        R.drawable.item122,
        information = listOf(
            InformationFive(
                name = R.string.name122,
                tribe = "우오우오족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「난 그저 하늘을 동경했을 뿐이야.」",
                info = "머멜리아 해국에서 태어난 강경한 머메이드 자메의 장녀. 야마토의 토끼를 원망하고 하늘을 동경해서 바다의 마녀로부터 약을 처방받았지만 날아다니는 것은 그다지 자신있어하지 않는다. 천체 관측이 취미. 좋아하는 음식은 생선 스테이크."
            )
        )
    ),
    CharacterFive(
        title = R.string.title123,
        R.drawable.item123,
        information = listOf(
            InformationFive(
                name = R.string.name123,
                tribe = "우오우오족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「사피르 니임~♥ 영원토록 사랑하겠습니다~♥」",
                info = "머멜리아 해국에서 태어난 멋부리는 것을 좋아하는 머메이드 자매의 차녀. 사피르의 광팬으로 육지를 동경해 바다의 마녀에게 약으로 다리를 교환받았다. 사피르를 쫒아다니는 것이 삶의 낙. 또 심각한 수준의 얀데레로 자신을 방해하는 상대는 이마의 뿔로 찔러서 피투성이로 만든다. 좋아하는 음식은 산호와 사피르."
            )
        )
    ),
    CharacterFive(
        title = R.string.title124,
        R.drawable.item124,
        information = listOf(
            InformationFive(
                name = R.string.name124,
                tribe = "토리토리족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「아름다운 목소리야, 부러워라.」",
                info = "토리토리족의 섬나라 하르퓌아 제도 태생이지만 지금 현재는 머멜리아 해국에 살고 있는 괴물. 일명 바다의 마녀로 불리며, 뛰어난 마술로 상대의 소망을 들어주는 대가로 몸의 일부를 빼앗는다. 마리나의 노랫소리를 빼앗으려는 계획을 세우고 있다. 배를 난파시키는 것을 좋아해서 바다에 빠지면 사냥감을 물어 죽인다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title125,
        R.drawable.item125,
        information = listOf(
            InformationFive(
                name = R.string.name125,
                tribe = "루카루카족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「넌 어느 바다에서 왔니~?」",
                info = "머멜리아 해국 태생의 소녀. 전설 속 달빛돌고래 일족의 피를 이어받고 있어서 해저 유적에서 자신의 본래 힘을 찾고 있다. 이래 봬도 샤키와 결혼한 사이...인것 같다(?). 촐랑거리고 호기심이 많아 웃는 얼굴이 끊이지 않는 상냥한 아이. 오징어 차 스퀴티를 좋아한다. 그것 때문에 자신도 모르게 이카코의 촉수에 달라붙어 버리곤 한다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title126,
        R.drawable.item126,
        information = listOf(
            InformationFive(
                name = R.string.name126,
                tribe = "사메사메족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「난 너의 동료가 아니라고...」",
                info = "머멜리아 해국 태생의 소년. 평소에는 독불장군이긴 하지만 어쩔 수 없이 동료로 착각당해 찰싹 달라붙고 다니는 루나를 돌봐주며 지켜주고 있다. 왠지 루나한테는 결혼한 걸로 알고 있지만, 비슷한 객체라도 종족이 다른 것을 신경쓰고 있다. 좋아하는 음식은 생선."
            )
        )
    ),
    CharacterFive(
        title = R.string.title127,
        R.drawable.item127,
        information = listOf(
            InformationFive(
                name = R.string.name127,
                tribe = "토리토리족",
                gender = maleString,
                rank = "$rankString$rankString",
                word = "「좋겠다... 나도 하늘을 날고 싶어...」",
                info = "하르퓌아 제도의 샤베트 아일랜드에 사는 펭귄 소년. 바깥 세상에서 온 페인과는 단짝 수준으로 친하다. 숏다리라고 놀리면 화를 낸다. 다른 새들처럼 하늘을 나는 것이 꿈이다. 좋아하는 음식은 생선."
            )
        )
    ),
    CharacterFive(
        title = R.string.title128,
        R.drawable.item128,
        information = listOf(
            InformationFive(
                name = R.string.name128,
                tribe = "이카이카족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「또 네녀석이야! 내 촉수 좀 물지 마~!」",
                info = "머멜리아 해국 태생의 소녀. 부끄러움을 많이 타는 관계로 귀 밑의 촉수로 얼굴을 가리는 것이 버릇. [~하자] 등의 중성적인 어조로 말을 한다. 마법산호를 가꾸는 것이 취미. 좋아하는 음식은 해조 샐러드."
            )
        )
    ),
    CharacterFive(
        title = R.string.title129,
        R.drawable.item129,
        information = listOf(
            InformationFive(
                name = R.string.name129,
                tribe = "호에호에족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「우후후... 천천히 보고 가~」",
                info = "머멜리아 해국에서 태어난 나긋나긋한 성격의 누님. 몸집은 매우 크지만, 작고 깨끗한 조개와 산호를 사용한 소품을 팔고 있다. 화나면 굉장히 무서운... 것 같다. 마법조개 수집이 취미이며, 좋아하는 음식은 새우."
            )
        )
    ),
    CharacterFive(
        title = R.string.title130,
        R.drawable.item130,
        information = listOf(
            InformationFive(
                name = R.string.name130,
                tribe = "에이에이족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「오늘도 머멜리아는 평화롭구나!」",
                info = "머멜리아 해국에서 태어난 건강 그 자체인 소년. 영웅이 되는 것이 꿈이며 오늘도 내일도 머멜리아의 경비를 게을리하지 않는다. 루나는 누나와도 같은 존재이며 곁에 있는 샤키를 적대시한다. 걸치고 있는 망토는 보물, 좋아하는 음식은 생선 소시지."
            )
        )
    ),
    CharacterFive(
        title = R.string.title131,
        R.drawable.item131,
        information = listOf(
            InformationFive(
                name = R.string.name131,
                tribe = "쿠라쿠라족",
                gender = femaleString,
                rank = rankString,
                word = "「어디를 가냐고요? 음~ 아직 안 정했어요~」",
                info = "머멜리아 해국 태생의 불가사의한 소녀. 온화한 성격으로 항상 바다 위를 둥둥 떠다니지만 그 생태는 수수께끼에 휩싸여 있다. 귀끝을 만지면 약간 톡톡 쏘이는 느낌이 난다. 좋아하는 음식은 해저 젤리."
            )
        )
    ),
    CharacterFive(
        title = R.string.title132,
        R.drawable.item132,
        information = listOf(
            InformationFive(
                name = R.string.name132,
                tribe = "무시무시족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「프레이니~!! 산책가자~!!」",
                info = "알베이유의 숲에 사는 꿀벌 소녀. 개구쟁이로 호기심이 왕성하다. 화나게 하면 엉덩이의 침으로 공격해온다. 프레이니와는 절친한 친구. 여왕벌의 피를 이어받고 있지만 본인은 바깥세상을 모험하는 것을 좋아하여 여왕이 되는 일을 거부하고 있다. 좋아하는 음식은 핫케이크."
            )
        )
    ),
    CharacterFive(
        title = R.string.title133,
        R.drawable.item133,
        information = listOf(
            InformationFive(
                name = R.string.name133,
                tribe = "무시무시족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「꽃밭... 처음 보는거야?」",
                info = "알베이유의 숲에 사는 나비 소녀. 온화하고 마음씨 좋은 성격의 소유자. 호기심 많은 클라우니와 숲 속을 모험하는 것을 좋아한다. 좋아하는 음식은 쇼트케이크."
            )
        )
    ),
    CharacterFive(
        title = R.string.title134,
        R.drawable.item134,
        information = listOf(
            InformationFive(
                name = R.string.name134,
                tribe = "무시무시족",
                gender = "?",
                rank = rankString,
                word = "「장마가 그립다야~」",
                info = "알베이유의 숲 기둥 속의 달팽이. 느긋느긋한 느림보다. 비 오는 날과 야채를 너무나도 좋아한다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title135,
        R.drawable.item135,
        information = listOf(
            InformationFive(
                name = R.string.name135,
                tribe = "무시무시족",
                gender = femaleString,
                rank = rankString,
                word = "「코코는 나는 게 서툴답니다.」",
                info = "알베이유의 숲에 사는 누에나방 소녀. 느긋느긋하고 번데기 적 시절의 버릇이 사라지지 않아서 어디에서나 잠들어 버린다. 자신의 고치로 뜨개질을 하는 것이 취미. 날개가 있는데 하늘을 나는 것이 서툴러서 연습을 하고 있다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title136,
        R.drawable.item136,
        information = listOf(
            InformationFive(
                name = R.string.name136,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「자신의 정의를 강요하기 전에, 다른 사람의 정의를 알아야 할 것이다.」",
                info = "오토누 마법경찰의 경위 경찰견. 시각, 청각이 모두 예리하고 뛰어나며 어떠한 범인조차 사로잡는다. 본부의 명령에 납득이 가지 않는다면 따르지 않고 자신의 의사를 관철하는 경우가 많지만 부하인 코니로부터는 두터울 정도로 신뢰를 받고 있다. 마석을 장식한 망토로 더 강력한 마법을 펼칠 수 있다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title137,
        R.drawable.item137,
        information = listOf(
            InformationFive(
                name = R.string.name137,
                tribe = "이누이누족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「저희 마법 경찰에게 맡겨주세요!」",
                info = "오토누 마법경찰의 순경 경찰견. 예의 바르고 누구에게나 존댓말로 말한다. 일에 열심이지만 고지식하고 어수룩하며 덜렁이인 면이 많아 상당한 트러블메이커다. 시력이 매우 안 좋아서 안경이 없으면 무용지물이다. 그러나 후각은 매우 좋으며 그 점은 상사인 도베르에게도 인정받는다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title138,
        R.drawable.item138,
        information = listOf(
            InformationFive(
                name = R.string.name138,
                tribe = "헤비헤비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「나랑 승부하자~!」",
                info = "귀사섬에서 태어난 오니 소녀. 귀사성의 후계자 후보의 딸로 장난스럽고 망나니다. 힘은 아버지로부터 물려받아 매우 강하며 항상 힘조절에 신경쓰고 있다. 자주 섬을 벗어나 야마토 본토에 놀러가기도 한다. 축제 등의 행사를 아주 좋아한다. 좋아하는 음식은 경단."
            )
        )
    ),
    CharacterFive(
        title = R.string.title139,
        R.drawable.item139,
        information = listOf(
            InformationFive(
                name = R.string.name139,
                tribe = "헤비헤비족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「정말, 나루코는 도움이 안되는군요.」",
                info = "귀사섬에서 태어난 오니. 후쿠미츠 카바야마의 부하로 주어진 일은 무엇이든지 해내는 고지식함을 가졌다. 항상 존댓말로 말하며, 동료 나루코와는 자주 다투는 편이다. 바람의 요술이 특기로, 등의 날개옷은 바람주머니가 되어 강력한 바람을 일으킨다. 좋아하는 음식은 텐동."
            )
        )
    ),
    CharacterFive(
        title = R.string.title140,
        R.drawable.item140,
        information = listOf(
            InformationFive(
                name = R.string.name140,
                tribe = "헤비헤비족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「후쿠미츠님~! 나한테 맡겨만 주시라요!」",
                info = "귀사섬에서 태어난 오니 일족. 후쿠미츠 카바야마의 부하로 동료 텐도우마루와는 정반대로 장난스러운 성격이다. 소리를 막대한 에너지로 변환하는 마기를 가져서 귓가의 북을 울려 천둥을 만들어낸다. 텐도마루를 놀려먹는 일과 음악을 좋아한다. 좋아하는 음식은 가츠동."
            )
        )
    ),
    CharacterFive(
        title = R.string.title141,
        R.drawable.item141,
        information = listOf(
            InformationFive(
                name = R.string.name141,
                tribe = "헤비헤비족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「더 이상 가까이 오지 마라.」",
                info = "야마토 태생의 오니. 저주를 내리는 요도를 소지하고 있으며 야마토에서 이슬비 내리는 밤에는 붉은 동백꽃에게 베어 죽는다는 소문이 끊임없이 돌고있다. 오니 일족 이외의 마케모를 원망하고 있으며 언제나 어딘가 쓸쓸해 보이는 얼굴을 하고 있다. 칠현금 소리를 좋아한다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title142,
        R.drawable.item142,
        information = listOf(
            InformationFive(
                name = R.string.name142,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「마법만으로는 전달할 수 없다. 그것은 장인의 일이다.」",
                info = "무국적 창작 요리집 겸 술집 [뱀눈초리]의 주인. 출신은 러시아냐지만 요리사로써의 경험은 야마토국에서 익힌 것. 애용하는 칼이 워낙 그을려 있고 취미가 훈제인 탓에 가게도 본인도 연기 냄새가 배어 있다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title143,
        R.drawable.item143,
        information = listOf(
            InformationFive(
                name = R.string.name143,
                tribe = "네코네코족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「거기있는 언니야! 신작 칵테일 마셔보지 않을래?」",
                info = "바 [릴리 레인]의 점장. 태어나고 자란 곳은 러시아냐이며 현재는 피자나 파스타가 맛있다는 이유로 나폴리오에서 살고 있다. 귀여운 언니와 미소년을 좋아하며 손님들 중에서 이상형이 있으면 쏜살같이 엮여댄다. 알마스의 발표회를 자주 들으러 간다. 좋아하는 음식은 페퍼론치노."
            )
        )
    ),
    CharacterFive(
        title = R.string.title144,
        R.drawable.item144,
        information = listOf(
            InformationFive(
                name = R.string.name144,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「난 반드시 마지리시아 어딘가에 묻혀있는 전설 속의 숨겨진 보물을 찾아내고 말거야!」",
                info = "레테 지방에서 보석이나 마석을 채굴하고 있는 활력만점 보물 사냥꾼. 온화하고 성실한 성격이다. 직감으로 보물의 소재를 알아낼 수 있다. 채취한 보물은 무무에게 팔아서 수익을 얻고 있지만, 원래 가치보다 낮은 값을 매겨서 바가지씌워지고 있는 건 모르고 있다. 좋아하는 음식은 계란 프라이와 후쿠진즈케 가 올려진 야끼소바."
            )
        )
    ),
    CharacterFive(
        title = R.string.title145,
        R.drawable.item145,
        information = listOf(
            InformationFive(
                name = R.string.name145,
                tribe = "라이라이족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「나의 이름은 흑태자의 루비...」",
                info = "로젤리아 태생의 귀족 소년. 쿨하며 신비주의적으로 보인다. 옛 라이벌들 중에서도 루비와 신뢰가 가장 두텁다. 사실은 루비의 광팬으로 밟히고 싶거나 복종하고 싶다는 망상을 부풀리는 진성 M. 보석, 땅, 바위와도 같은 물질을 뾰족하게 변형시키는 마기를 지니고 있다. 십자가를 좋아하며 중2병끼도 겸비하고 있다. 병약한 편."
            )
        )
    ),
    CharacterFive(
        title = R.string.title146,
        R.drawable.item146,
        information = listOf(
            InformationFive(
                name = R.string.name146,
                tribe = "로바로바족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「저... 정말로 괜찮을까...?」",
                info = "자우하라 출신인 마석왕의 아들. 인심은 좋지만 속이 좁다. 불행 체질에 무슨 일이든 쉽게 믿어버린다. 스스로에게 자신이 없어서 친구가 적은 것을 걱정하고 있다. 첫 친구는 사피르로 더 친해지려고 노력하고 있다. 당나귀라고 부르면 화를 낸다. 매운 것은 잘 먹지를 못하며, 좋아하는 음식은 라멘."
            )
        )
    ),
    CharacterFive(
        title = R.string.title147,
        R.drawable.item147,
        information = listOf(
            InformationFive(
                name = R.string.name147,
                tribe = "래비래비족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「함께 연구하시지 않겠습니까요?」",
                info = "언제나 틀어박혀 수상한 연구를 하고있는 연구원 Dr. 민들레라는 이름으로 알려져 있지만 시시한 효과의 약만 만들어내고 있다. 수제 특효영양제 앰플을 통해 [솜털]의 모습으로 변하여 강력한 힘을 얻을 수 있다. 오타쿠 기질로 남녀를 불문하고 들이댄다. 알렌이 첫사랑. 말투도 걸음걸이도 이상하다."
            )
        )
    ),
    CharacterFive(
        title = R.string.title148,
        R.drawable.item148,
        information = listOf(
            InformationFive(
                name = R.string.name148,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「아쿠아파차가 먹고싶네~」",
                info = "나폴리오의 항구에서 태어난 선원 소년. 물 마법이 특기지만 귀찮다는 이유로 항상 바주카포를 들고 다닌다. 물건을 부수는 것과 상대방이 괴로워하는 모습을 보는 것을 좋아한다. 특히 사촌인 에메로드를 괴롭히는 것에 열중하고 있다. 낚시는 잘 못한다. 형을 싫어하는 기색을 보이지만 아주 그런 것도 아니다. 좋아하는 음식은 아쿠아파차 등의 해산물 요리."
            )
        )
    ),
    CharacterFive(
        title = R.string.title149,
        R.drawable.item149,
        information = listOf(
            InformationFive(
                name = R.string.name149,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「이런 바다가 있었다니... 아쿠아한테도 보여주고 싶다.」",
                info = "나폴리오의 항구에서 태어난 열혈 해적 청년. 어렸을 적에 바다로 떠나 전 세계, 주로 머멜리아를 여행했다. 조개 팬던트 안에 아쿠아와의 사진을 간직하고 있을 정도로 아쿠아를 매우 좋아하는 브라콘. 마법에 능숙하지 않아서 폭탄으로 공격한다. 수영이 특기. 좋아하는 음식은 과일."
            )
        )
    ),
    CharacterFive(
        title = R.string.title150,
        R.drawable.item150,
        information = listOf(
            InformationFive(
                name = R.string.name150,
                tribe = "래비래비족",
                gender = "$maleString/$femaleString/$maleString",
                rank = "$rankString$rankString",
                word = "「오빠(형), 어서와~」",
                info = "꽃의 도시 플뢰르미아에서 살고 있는 알렌의 남매, 장녀 선은 활기차고, 차녀 도라는 차분하고 상냥하며 차남 이트는 성질있고 부끄러움이 많아 분홍색 털에 신경쓸 나이다. 오빠(형)을 열렬하게 사랑한다. 히스이와 친하다."
            )
        )
    )
)