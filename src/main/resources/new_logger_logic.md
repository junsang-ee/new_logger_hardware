# USER
- save
    - HttpMethod : Post
    - dto : UserSaveRequest
        - String name
        - emailString
        - String password
        - registrationCode (null 혹은 빈값일 때 도메인 데이터)
    - Set appPush, loginInfo default data
        - AppPush
            - 이벤트 발생 및 야간 수신 비동의(및 동의) default 값으로 appPush 생성 후 UserEntity에 Set
        - LoginInfo
            - 로그인 실패 횟수 0회 및 임시비밀번호 null data default 값으로 loginInfo 값 생성 후 UserEntity에 Set

# LOGGER