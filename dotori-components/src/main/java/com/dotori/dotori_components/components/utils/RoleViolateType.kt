package com.dotori.dotori_components.components.utils

enum class RoleViolateType {
    FIREARMS,
    WEAPON,
    ALCOHOL,
    TOBACCO,
    MEANDERING_APPARATUS,
    FOOD,
    USE_FIREARMS,
    USE_WEAPON,
    DRINKING_ALCOHOL,
    USE_TOBACCO,
    USE_MEANDERING_APPARATUS,
    EAT_FOOD,
    MANAGER_GUIDANCE,
    TIME,
    OUTING,
    OVERNIGHT_STAY,
    DAMAGE_OF_GOODS,
    THEFT,
    CHANTAGE,
    DISTURBING_SLEEP,
    ELECTRONIC_DEVICE,
    LOUD,
    INCORRECT_ENTRY,
    LAUNDRY,
    VIOLATION_OF_THE_USE_OF_FACILITIES,
    DAMAGE_OF_POST,
    POSSESSION_OF_ELECTRONICS_DEVICES,
    CLEAN_COUNDITION_BAD,
    ENVIRONMENT_POLLUTION,
    AFFECTIONATE_ACT,
    SEXUAL_ACT,
    ENTRY_TO_PROHIBITED_AREAS,
    VIOLATION_OF_STUDY_ROOM_RULES,
    OUTSIDER_ENTRY
}

val roleTypeMap = mapOf(
    RoleViolateType.FIREARMS to "반입 - 화기류",
    RoleViolateType.WEAPON to "반입 - 흉기",
    RoleViolateType.ALCOHOL to "반입 - 주류",
    RoleViolateType.TOBACCO to "반입 - 담배",
    RoleViolateType.MEANDERING_APPARATUS to "반입 - 사행성기구",
    RoleViolateType.FOOD to "반입 - 음식",
    RoleViolateType.USE_FIREARMS to "사용 - 화기류",
    RoleViolateType.USE_WEAPON to "사용 - 흉기",
    RoleViolateType.DRINKING_ALCOHOL to "사용 - 주류",
    RoleViolateType.USE_TOBACCO to "사용 - 담배",
    RoleViolateType.USE_MEANDERING_APPARATUS to "사용 - 사행성기구",
    RoleViolateType.EAT_FOOD to "사용 - 음식",
    RoleViolateType.MANAGER_GUIDANCE to "사감의 학습 및 생활지도 불이행",
    RoleViolateType.TIME to "지각",
    RoleViolateType.OUTING to "외출",
    RoleViolateType.OVERNIGHT_STAY to "외박",
    RoleViolateType.DAMAGE_OF_GOODS to "물품훼손",
    RoleViolateType.THEFT to "절도",
    RoleViolateType.CHANTAGE to "갈취",
    RoleViolateType.DISTURBING_SLEEP to "타호실 출입",
    RoleViolateType.ELECTRONIC_DEVICE to "전자기기 소지",
    RoleViolateType.LOUD to "고성방가",
    RoleViolateType.INCORRECT_ENTRY to "지정시간 외 기숙사 출입",
    RoleViolateType.LAUNDRY to "세탁기,건조기에 세탁물 방치",
    RoleViolateType.VIOLATION_OF_THE_USE_OF_FACILITIES to "공공시설물 사용규정 위반",
    RoleViolateType.DAMAGE_OF_POST to "부착된 게시물 훼손 및 낙서",
    RoleViolateType.POSSESSION_OF_ELECTRONICS_DEVICES to "전자기기 소지 혹은 사용",
    RoleViolateType.CLEAN_COUNDITION_BAD to "호실 정리정돈 상태 불량",
    RoleViolateType.ENVIRONMENT_POLLUTION to "기숙사 환경 오염",
    RoleViolateType.AFFECTIONATE_ACT to "애정 행위",
    RoleViolateType.SEXUAL_ACT to "성적 행위",
    RoleViolateType.ENTRY_TO_PROHIBITED_AREAS to "출입금지 구역 줄입",
    RoleViolateType.VIOLATION_OF_STUDY_ROOM_RULES to "학습실 면학분위기 저해",
    RoleViolateType.OUTSIDER_ENTRY to "외부인 출입 허가",
)