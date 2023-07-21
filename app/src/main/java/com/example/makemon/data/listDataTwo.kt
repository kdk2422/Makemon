package com.example.makemon.data

import com.example.makemon.R

data class InformationTwo(
    val name: Int,
    val tribe: String,
    val gender: String,
    val rank: String,
    val word: String,
    val info: String
)

data class CharacterTwo(
    val title: Int,
    val image: Int,
    val information: List<InformationTwo>
)

var listDataTwo = listOf(
    CharacterTwo(
        title = R.string.title31,
        R.drawable.item31,
        information = listOf(
            InformationTwo(
                name = R.string.name31,
                tribe = "모리모리족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「이 교실에서는, 마법도구의 생성을 비롯한 연금술과 주술학을 배운다.」",
                info = "소르시엘 마법학교에서 연금술과 주술학을 가르치는 엘리트 교사. 학생들 사이에서는 학교에서 가장 무서운 선생님으로써 두려움을 사고 있다. 화나게 했다간 강인한 날개로 얻어맞는다. 어둠 마법이 특기이며 구현화된 그림자를 자유자재로 조종하는 마기를 지니고 있다. 다리가 약해서 언제나 무기인 창을 지팡이로 대신 쓰고 있다. 양 팔은 과거에 연금술 실패로 인해 잃은 듯 하다. 실은 딸인 베리베릴을 맹목적으로 사랑하고 있다. 또한, 교장에게 충성을 맹세하고 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title32,
        R.drawable.item32,
        information = listOf(
            InformationTwo(
                name = R.string.name32,
                tribe = "모리모리족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「주술학만은... 배우고 싶지 않아요...」",
                info = "햇빛을 싫어해서 언제나 양산을 쓰고 있는 아가씨. 소르시엘 마법학교의 학생, 아버지인 벨리온이 교사로 재직중, 그 때문인지 다가가기 힘든 인상을 가지게 되는 것에 대해서 고민하고 있으며 아버지가 싫은 편. 평소에는 혼자 있지만 사실은 친구를 사귀고 싶어한다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title33,
        R.drawable.item33,
        information = listOf(
            InformationTwo(
                name = R.string.name33,
                tribe = "무시무시족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「선생님은 정령이 아니에요...!!」",
                info = "소르시엘 마법학교에서 약초학을 가르치고 있는 교사. 알베이유의 숲 출신의 무시무시족으로 학생들로부터 요정으로 착각당해 붙잡히는 일도 종종 있다. 종족적 요인으로 마력의 보유량은 적고, 등급은 4성에 이르지 못하지만 굉장히 현명하고 방대한 지식을 가지고 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title34,
        R.drawable.item34,
        information = listOf(
            InformationTwo(
                name = R.string.name34,
                tribe = "바쿠바쿠족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「오호호, 마법은 이미지 랍니다.」",
                info = "소르시엘 마법학교의 부교장 겸 마법학의 교사. 자신 특유의 마법이나 마술을 찾아 펼치기 위한 상상력의 소중함을 가르치고 있다. 최안 마법이 특기이며 파이프에서 나오고 있는 연기는 그녀의 마력을 구현화하여 내뿜고 있는 것이다. 예술가이기도한 그녀의 회화는 수천만원에 거래되어 지고 있다. 금품이나 보석을 좋아한다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title35,
        R.drawable.item35,
        information = listOf(
            InformationTwo(
                name = R.string.name35,
                tribe = "케몬클루스",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「이 몸의 필살기를... 받아 보거라!」",
                info = "장난을 좋아하고 사나운 성격. 신체의 일부를 무기로 바꾸는 마기를 가졌으며, 대포에서는 무엇이든 불태우는 포격을 연발한다. 꼬리처럼 충전 코드가 있지만 평소에는 공기 중의 마력을 에너지로 변환해서 가동시킬 수도 있다. 좋아하는 음식은 일렉트릭 사이다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title36,
        R.drawable.item36,
        information = listOf(
            InformationTwo(
                name = R.string.name36,
                tribe = "케몬클루스",
                gender = maleString,
                rank = rankString,
                word = "「정말... 가쿠, 청소하는 데 방해되니까 그만 좀 해.」",
                info = "온후하고 친절한 성격. 배의 주머니에서 가정용품을 꺼낼 수 있다. 전투모드가 되면 프라이팬을 꺼내서 무기로 삼는다. 항상 가쿠에게 휘둘리며 자주 짧은 다리로 놀림받아서 화낸다. 좋아하는 음식은 핫도그."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title37,
        R.drawable.item37,
        information = listOf(
            InformationTwo(
                name = R.string.name37,
                tribe = "케몬클루스",
                gender = "?",
                rank = rankString,
                word = "「친환경은 중요한 거에요♪」",
                info = "누구에게나 존댓말로 말하는 로봇. 머리의 잎사귀는 태양열 전지판으로 되어 있어서 태양의 빛을 흡수해서 에너지로 삼고 있다. 꼬리의 잎사귀로 물을 빨아들인다. 환경보호 활동이 취미. 평소에는 상냥하지만 환경을 파괴하는 행위만은 용납하지 않는다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title38,
        R.drawable.item38,
        information = listOf(
            InformationTwo(
                name = R.string.name38,
                tribe = "케몬클루스",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「자, 형광봉을 흔들어 보자구요!」",
                info = "노래부르기를 좋아하는 토끼형 로봇. 상냥한 언니 타입. 하지만 조금 억지스러운 면도 종종... 가슴의 젬 색깔을 바꿔서 여러가지 속성 공격을 할 수 있지만 그럴 때마다 인격도 조금 바뀐다. 평상시의 노멀 폼은 노래하는 것으로 치료마법을 발휘시킬 수 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title39,
        R.drawable.item39,
        information = listOf(
            InformationTwo(
                name = R.string.name39,
                tribe = "케몬클루스",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「...이미 내부의 정보를 얻어내고 있다.」",
                info = "쿨하고 과묵한 로봇. 모든 정보를 정확히 파악한다. 바이러스를 조종하는 능력을 가지고 있으며 기계라면 상대를 얼려버릴 수 있다. 얼음 손톱을 뻗어서 싸운다. 그런데도 추위를 타서 자주 감기에 걸린다. 부정적인 사고에 빠지면 한동안은 거기에 헤어나올 수 없게 된다. 온갖 정보를 모으는 것이 특기. 좋아하는 음식은 샤베트."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title40,
        R.drawable.item40,
        information = listOf(
            InformationTwo(
                name = R.string.name40,
                tribe = "케몬클루스",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「초심을 잊어서는 안되겠지♪」",
                info = "로봇인데도 기계를 다루는 것이 취미인 메카오타쿠. 애용하는 스패너로 무엇이든지 개조시킬 수 있다. 특수 소재로 만들어진 가쿠에게 흥미를 가져 가쿠 오빠라고 부르면서 자주 따라다닌다. 좋아하는 음식은 핫케이크."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title41,
        R.drawable.item41,
        information = listOf(
            InformationTwo(
                name = R.string.name41,
                tribe = "케몬클루스",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「주어진 사명을 수행할 뿐이다.」",
                info = "현저히 감정이 결여되어 있는 로봇. 다른 사람을 죽이는 데에 거리낌이 없는 냉혹무도한 성격을 띠고 있어 가쿠를 토벌하려고 하고 있다. 라이트세이버는 가쿠와 마찬가지로 닿기만 해도 무엇이든 불태울 수 있는 힘을 지녔다. 천진난만한 면도 있고 잭에게 딴지가 걸린다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title42,
        R.drawable.item42,
        information = listOf(
            InformationTwo(
                name = R.string.name42,
                tribe = "그늘그늘족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「요 거기 너, 오늘은 도망치지 못할 걸!」",
                info = "동료 제브라이트와 행동을 같이 하고 있는 사이보그. 손가락에서 마력으로 정제한 탄환을 발사할 수 있다. 가쿠를 쫓고 있지만 언제나 임무는 실패로 끝난다. 제브라이트의 지나친 행동을 말리러 냅다 달려가거나 딴지건다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title43,
        R.drawable.item43,
        information = listOf(
            InformationTwo(
                name = R.string.name43,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「용으로써의 자긍심을 갖지 않겠는가...」",
                info = "용의 고을 태생 장남인 번개의 용. 착실하고 자존심이 높은 리더적인 존재이다. 형제들 중에서도 호카게와 마미유와 사이가 좋다. 용의 고을의 발전을 위해 관광업에 종사하고 있으며 온천 마니아 이기도 하다. 고풍스러운 말투를 갖추고 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title44,
        R.drawable.item44,
        information = listOf(
            InformationTwo(
                name = R.string.name44,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「너무 늦었다면은, 냅둬도 돼.」",
                info = "용의 고을 태생 삼남인 바람의 용. 나르시스트이며, 여자아이를 너무나도 좋아한다. 마미유 곁을 따라다니는 편. 빠른 속도로 나는 것을 잘해서 주위의 페이스를 맞추지 못하며 조급한 면이 있다. 바람에 몸을 맡기고 나는 것이 취미. 좋아하는 음식은 샐러리."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title45,
        R.drawable.item45,
        information = listOf(
            InformationTwo(
                name = R.string.name45,
                tribe = "류우류우족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「호카야, 날씨가 더우니까 좀 내려와줄래...?」",
                info = "용의 고을 태생 장녀인 얼음의 용. 착실하고 자상한 모두의 언니누나로 모두의 상담 상대가 되는 일이 많다. 몸에서 얼음의 마력이 넘치고 있어서 아주 쌀쌀하다. 뜨거운 것을 잘 못 먹고 요리를 잘한다. 좋아하는 음식은 아이스크림."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title46,
        R.drawable.item46,
        information = listOf(
            InformationTwo(
                name = R.string.name46,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「용의 고을은, 나의 소중한 고향이야.」",
                info = "쇠퇴 위기에 처한 용의 고을을 지켰던 차남인 불꽃의 용. 형제들 중에서도 착실한 편에 속해서 연하인 여자아이들에겐 상냥하지만, 남자들에겐 엄격하며 체리드라와 사이가 좋다. 몸에서 불꽃의 마력이 넘쳐흐르고 꼬리 끝에서는 불꽃이 타오르고 있다. 좋아하는 음식은 매운 것."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title47,
        R.drawable.item47,
        information = listOf(
            InformationTwo(
                name = R.string.name47,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「...뭘 보는거야?」",
                info = "용의 고을 태생 사남인 나무의 용. 호카게의 첫사랑으로 성별을 착각당하면 화를 낸다. 무뚝뚝하고 과묵하지만 입만 열면 크나큰 독설을 내뱉는다. 몸에서 수목의 마력이 흘러넘치고 귀에서 과일이 열린다. 먹으면 아주 영양가가 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title48,
        R.drawable.item48,
        information = listOf(
            InformationTwo(
                name = R.string.name48,
                tribe = "류우류우족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「아, 저기, 그거 이상한 거 아니야...?」",
                info = "용의 고을 태생의 차녀인 독의 용. 근심이 많아서 늘 쩔쩔매고 있다. 늘 책을 읽긴 하지만 무슨 책을 읽고 있는지는 아무도 모른다. 슈와 같이 부녀자인 것 같다. 마미유와 사이가 좋다. 좋아하는 음식은 독버섯."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title49,
        R.drawable.item49,
        information = listOf(
            InformationTwo(
                name = R.string.name49,
                tribe = "류우류우족",
                gender = femaleString,
                rank = "$rankString$rankString$rankString",
                word = "「강 속은 느긋하고 기분이 좋습니다.」",
                info = "용의 고을 태생 삼녀인 물의 용. 늘 멍하니 있다. 강에서 수영하는 경우가 많고 이 때는 물과 동화되어있기 때문에 모습은 보이지 않는다. 어미가 [~니다]로 끝마침을 맺는 것이 버릇이다. 물의 공을 만들어서 띄우는 것이 특기다. 좋아하는 음식은 물만두."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title50,
        R.drawable.item50,
        information = listOf(
            InformationTwo(
                name = R.string.name50,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「꺄~! 나 무섭~지!」",
                info = "용의 고을 태생 오남인 빛의 용. 응석을 잘 부리고 귀여움을 이용하는 약삭빠른 녀석. 날개가 달려있긴 하지만 아직 잘 날지를 못한다. 육남인 카라스마루와는 절친한 사이다. 몸에서 빛의 마력이 넘쳐나고 머리 위에는 천사의 고리와 같은 빛이 나고 있다. 좋아하는 음식은 솜사탕."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title51,
        R.drawable.item51,
        information = listOf(
            InformationTwo(
                name = R.string.name51,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「...엘(엘미), 어디 가는거야?」",
                info = "용의 고을 태생 육남인 어둠의 용. 조용하고 과묵하지만 외로움을 잘 탄다. 엘미와 마찬가지로 날개가 달려 있지만 아직 잘 날지를 못한다. 부끄럼을 타면 그림자가 되어 숨어버린다. 몸에서 어둠의 마력이 넘쳐나고 꼬리 끝에서는 어둠덩어리가 고여있다. 좋아하는 음식은 우동."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title52,
        R.drawable.item52,
        information = listOf(
            InformationTwo(
                name = R.string.name52,
                tribe = "류우류우족",
                gender = maleString,
                rank = "$rankString$rankString$rankString",
                word = "「챠챠는 배고파~」",
                info = "용의 고을 태생 칠남인 흙의 용. 아직 어린애라서 응석받이에다가 울보다. 용의 기운을 잘 사용하지 못하지만 감정이 격해지면 지진을 일으킬 정도의 힘을 가지고 있다. 땅 속에 잠입하는 것이 특기이며 모래놀이나 진흙 경단을 만드는 것을 좋아한다. 좋아하는 음식은 냄비요리."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title53,
        R.drawable.item53,
        information = listOf(
            InformationTwo(
                name = R.string.name53,
                tribe = "이누이누족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「소인의 뒤로 따라오도록.」",
                info = "야마토국에서 태어난 닌자 소년. 성실하고 주어진 임무는 확실하게 완수한다. 인술 솜씨는 일류지만 매번 동료 미우에게 애를 먹고 있다. 안개로 상대를 어지럽히는 기술이 특기. 좋아하는 음식은 주먹밥."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title54,
        R.drawable.item54,
        information = listOf(
            InformationTwo(
                name = R.string.name54,
                tribe = "네코네코족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「와아 경단이다!! 잘 먹겠습니~다♪」",
                info = "야마토국에서 태어난 쿠노이치 소녀. 장난기 많고 실수투성이지만 아주 긍정적이다. 키리마루에게 인술을 배우고 있다. 봄에 태어나서 꽃구경을 좋아하고, 또 먹는 것도 굉장히 좋아하는 대식가. 좋아하는 음식은 경단."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title55,
        R.drawable.item55,
        information = listOf(
            InformationTwo(
                name = R.string.name55,
                tribe = "콩콩족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「우리들 나라의 오곡풍양을 기원하노라.」",
                info = "야마토에서 신으로 모셔진 하얀 여우. 이자카의 신사에 살고 있으며 불꽃과 번개의 요술이 자랑거리다. 소원을 이루어주는 마기를 가졌지만 그 힘을 잘 다루지 못해서 고민하고 있다. 견실하지만 화를 잘 낸다. 넘치는 마력을 지닌 꼬리 그 자체가 불길이 되어 타오르고 있다. 술과 유부를 좋아한다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title56,
        R.drawable.item56,
        information = listOf(
            InformationTwo(
                name = R.string.name56,
                tribe = "콩콩족",
                gender = maleString,
                rank = rankString,
                word = "「젠장~ 그 짜증나리녀석... 헛! 이, 이자나리님!?」",
                info = "라멘점 경영의 실패로 길을 헤메다가 이자나리에게 도움을 받아 이자카 신사를 모시기 시작한 여우지만 늘 허드렛일을 맡고 있다. 표리부동하며 이자나리에게 언제나 굽실굽실거리지만 여우같은 사나움에 뒤로는 코하쿠에게 푸념하는 고생길을 걷고 있다. 칸사이 사투리로 떠들고 돈에 쪼들려서 언제나 컵라면을 먹고 있다. 자주 참배를 오는 누이에게 연심을 두고 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title57,
        R.drawable.item57,
        information = listOf(
            InformationTwo(
                name = R.string.name57,
                tribe = "콩콩족",
                gender = "?",
                rank = "$rankString$rankString$rankString$rankString",
                word = "「냐하하~ 또 속았다모!」",
                info = "장난을 좋아하는 개구쟁이 구미호. 이마의 살생석으로 봉인되어 있어서 이자카 신사에서는 나올수가 없다. 이러쿵저러쿵 키나리와는 악우이며 잔꾀를 부리며 협력하는 일도 종종... 둔갑술과 독의 요술이 특기이며 늘 주위를 속이고 있다. 귀여워 보이려고 어미에 [~모]를 붙인다. 좋아하는 음식은 떡과 솜사탕이며, 싫어하는 음식은 가지."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title58,
        R.drawable.item58,
        information = listOf(
            InformationTwo(
                name = R.string.name58,
                tribe = "콩콩족",
                gender = femaleString,
                rank = "$rankString$rankString",
                word = "「이자나리님은 신이에요.」",
                info = "하루치라는 애칭으로 사랑받고 있는 이자카 신사의 무녀. 열심히 임하지만 어지간한 덜렁이로 이자나리의 불꽃으로 촛불을 헌등할 때 실수로 신사를 태워먹을 뻔하기도 했다. 과거에 기도가 이루어진 적이 있어서 이자나리를 신앙하고 있다. 지역 안에 있는 차바시라 긴토키의 서당에 다니고 있다. 좋아하는 음식은 천년엿."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title59,
        R.drawable.item59,
        information = listOf(
            InformationTwo(
                name = R.string.name59,
                tribe = "콩콩족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString",
                word = "「오늘은 다도를 배우겠어요」",
                info = "이자카 신사의 경내에 있는 서당에서 수련을 시키고 있는 온화하고 상냥한 교사. 다도가 취미이고 수련을 한 뒤엔 계절별로 달콤한 간식과 차를 준비해 온다. 이자나리의 사정을 잘 알고 있는 인물. 술버릇이 아주 고약하며, 취하면 욕설을 하는 듯하다. 이자나리와 함께 마시는 것을 완강히 거부하고 있다."
            )
        )
    ),
    CharacterTwo(
        title = R.string.title60,
        R.drawable.item60,
        information = listOf(
            InformationTwo(
                name = R.string.name60,
                tribe = "콩콩족",
                gender = maleString,
                rank = "$rankString$rankString$rankString$rankString$rankString",
                word = "「이 녀석의 보살핌을 부탁한다.」",
                info = "야마토에서 태어난 음양사 겸 주술사. 코하쿠를 봉인해 이자카 신사에 맡긴 장본인이며 코하쿠에게 원망을 사고 있다. 이자나리와는 앙숙이지만 믿음은 있다. 매우 수수께끼가 많은 인물."
            )
        )
    )
)