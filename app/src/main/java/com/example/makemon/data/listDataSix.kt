package com.example.makemon.data

import com.example.makemon.R

data class InformationSix(
    val name: Int,
    val tribe: String,
    val gender: String,
    val rank: String,
    val word: String,
    val info: String
)

data class CharacterSix(
    val title: Int,
    val image: Int,
    val information: List<InformationSix>
)

var listDataSix = listOf(
    CharacterSix(
        title = R.string.title151,
        R.drawable.item151,
        information = listOf(
            InformationSix(
                name = R.string.name151,
                tribe = "쿠마쿠마족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「역시 돌체 오빠가 만드는 과자는 별미에요~」",
                info = "느긋한 성격의 흰 곰 소녀. 책을 좋아해서 도서관에서 일하고 있다. 이래 봬도 힘이 세다. 러시아냐에 위치한 작은 눈 섬에 지어진 이글루에 살고 있다. 가끔씩 들러주는 돌체 제과점의 슈크림이나 과일잼쿠키를 좋아한다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title152,
        R.drawable.item152,
        information = listOf(
            InformationSix(
                name = R.string.name152,
                tribe = "네코네코족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「우하하하! 나의 능력을 천천히 구경해보시라!」",
                info = "마법과학에 정통한 똑똑한 남자아이. 씬이라는 전자공간을 전개해 그 내부에서 자유자재로 폴리곤을 정제하고 조형한 오브젝트로 공격하는 특수한 전투방법을 사용한다. 헤드셋부터 코드, 장갑에 걸쳐 모든 것이 능력과 연동되어 있어 그것들이 없으면 능력을 사용할 수 없다. 자주 뽐내는 얼굴을 한다. 빛나는 것들을 좋아한다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title153,
        R.drawable.item153,
        information = listOf(
            InformationSix(
                name = R.string.name153,
                tribe = "레온레온족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「페로로로~ 그럼 오늘부터 약술 공부를 시작해볼까요오~!」",
                info = "소르시엘 마법학교에서 약술학을 가르치고 있는 교사. 개성 넘치는 선생님들 중에서도 손꼽히는 괴짜로 불리지만 강의는 매우 재미있고 인기가 높다고 한다. 몸의 색깔을 다양한 색상으로 바꿀 수 있다. 소용돌이 모양에 유별난 집착을 가지고 있어서 그 어떤 약일지라도 막대사탕 모양으로 정제한다. 습기가 찬 곳이나 비오는 날을 좋아한다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title154,
        R.drawable.item154,
        information = listOf(
            InformationSix(
                name = R.string.name154,
                tribe = "우오우오족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「어머어머, 이리 와서 선생님께 상처난 곳좀 보여줄래?」",
                info = "소르시엘 마법 학교의 보건실에서 일하는 선생님. 이마의 뿔은 어떤 부상일지라도 치유하는 효과가 있어서 부러뜨린 것을 달여 마시게 하는 치료를 행한다. 부러진 뿔은 본인의 강력한 회복력을 가진 마기로 인해 다음날이면 완치되어 있다. 선생님을 만나기 위해 일부러 부상당하거나 병에 걸리는 학생들이 속출할 정도로 인기가 많다. 평소에는 거대한 수조 속에 있지만 밖으로 나올 때는 어항에 들어간다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title155,
        R.drawable.item155,
        information = listOf(
            InformationSix(
                name = R.string.name155,
                tribe = "종족불명",
                gender = "?",
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「자신이 누구인가 하는 것은 스스로 찾아내는 것이라고?」",
                info = "소르시엘 마법학교의 교장선생님. 모든 것이 수수께끼에 싸여 있어 평상시는 마호로우의 모습으로 교내를 난무하고 있다. 말을 할 때마다 항상 목소리가 바뀌는 것 같다. 소탈한 면도 있는 것 같다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title156,
        R.drawable.item156,
        information = listOf(
            InformationSix(
                name = R.string.name156,
                tribe = "토리토리족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「어서와요, 보지 못한 얼굴이네요. 나그네이신가요?」",
                info = "섬나라 하르퓌아 제도에서 태어나 야마토에서 자란 새의 소녀. 야마토에서 감미처(단맛이 나는 가게)인 [코마치]를 운영하고 있다. 거침없이 말할 수 있는 배짱이 있으며 항간에서는 아이돌 같은 존재이다. 그다지 고향에 대해서는 이야기하고 싶지 않는 듯하다. 좋아하는 음식은 안미츠."
            )
        )
    ),
    CharacterSix(
        title = R.string.title157,
        R.drawable.item157,
        information = listOf(
            InformationSix(
                name = R.string.name157,
                tribe = "하리하리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「너어, 나랑 승부하자.」",
                info = "자기를 다루는 마법을 가지고 있는 고슴도치. 자력을 증배시키기 위해 자신의 팔을 개조할 정도로 개조를 좋아해서 메카에는 사족을 못쓴다. 전기를 조정, 재구축 하는 [젝트]와는 소꿉친구로서 라이벌이다. 혈기가 왕성해서 전투에서 흥분하거나 힘을 너무 많이 사용하면 코피가 흐른다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title158,
        R.drawable.item158,
        information = listOf(
            InformationSix(
                name = R.string.name158,
                tribe = "이누이누족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「우후후...뭔가 야릇한 소리인걸...♥」",
                info = "소리의 마법에 특기있는 작곡가 소녀. 발라드부터 재즈까지 폭넓은 악곡을 다루어 팬이 많다. 청초해 보이지만 음악에 관해서라면 순간 변태가 되어 버린다. 항상 기분 좋은 소리를 추구한다. 매운 음식을 좋아한다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title159,
        R.drawable.item159,
        information = listOf(
            InformationSix(
                name = R.string.name159,
                tribe = "이누이누족",
                gender = "?",
                rank = "$rankString$rankString",
                word = "「챠오!」",
                info = "챠오라는 이름하에 버추얼 미소녀를 연기하는 바야챠오를 모티브로 삼아 크리에이티브한 부분을 추출한 강아지. 바비오처럼 배가 고프면 기분이 나빠져서 폭발한다. 먹는 것을 아주 좋아한다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title160,
        R.drawable.item160,
        information = listOf(
            InformationSix(
                name = R.string.name160,
                tribe = "이누이누족",
                gender = maleString,
                rank = rankString,
                word = "「하아...??이치고 싶어......」",
                info = "챠오라는 이름하에 버추얼 미소녀를 연기하는 바야챠오를 모티브 삼아 크리에이티브한 부분 이외를 추출한 쓰레기. 게임도 못하고 말이 험하고 매일 ??를 하면서 잠자는게 일과인 동정. 마지리시아에서는 집에 틀어박혀서 귀여운 아이를 보면 야한 그림을 그리고 있다. 마법을 쓸줄 모르며 항상 폭탄을 소지하고 있다."
            )
        )
    ),
    CharacterSix(
        title = R.string.title161,
        R.drawable.item161,
        information = listOf(
            InformationSix(
                name = R.string.name161,
                tribe = "래비래비족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「우헤헤... 좋은 만화 소재가 생각났다~!」",
                info = "나폴리오에서 태어난 소녀. 마법학교 졸업 후 날씨마법을 연구하면서 만화를 그리며 살고 있다. 마법과학에 정통하며 유사태양을 만들어내는 실험 도중에 소환된 것이 평상시에는 머리 위에 모자 대신 타고 다니는 마물 [히노마루]로 연구를 도와주는 좋은 파트너. 좋아하는 음식은 당근이 많이 들어간 카레. 참고로 그리는 만화가 좀 변태스럽다."
            )
        )
    )
)