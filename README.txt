

1.  Lombok 관련 어노테이션
 (1) @Setter 
 : setter 메서드를 생성해 주는 역할
 - 3가지 속성
   -> value : 접근 제한 속성을 의미
   -> onMethod: setter 메서드의 생성 시 메서드에 추가할 어노테이션 지정 
   -> onParam: setter 메서드의 파라미터에 어노테이션을 사용하는 경우에 적용
(2) @Data
 : @ToString, @EqualsAndHashCode, @Getter/Setter, @RequriedArgsConstructor를 모두 결합한 형태,
  한 번에 자주 사용되는 모든 메서드들을 생성할 수 있음 (Lombok에서 가장 자주 사용)
(3) @Log4j
 : 로그 객체 생성
  log4j가 존재하지 않을 경우, @Log 이용


2. Spring 관련 어노테이션
 - @Autowired
 : 스프링 내부에서 자신이 특정한 객체에 의존적이므로 자신에게 해당 타입의 빈을 주입해주라는 표시
 - @Component
 : 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시

3. 테스트 관련 어노테이션
 - @RunWith
 : 테스트 시 필요한 클래스 지정
 - @ContextConfiguration
 : 스프링이 실행되면서 어떤 설정 정보를 읽어 들여야 하는지 명시
 - @Test
 : junit에서 해당 메서드가 jUnit 상에서 단위 테스트의 대상인지 알려줌