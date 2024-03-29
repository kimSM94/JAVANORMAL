# JAVANORMAL

<h1> 오버라이딩 <h1>
<h3>P328  오버라이딩 조건</h3>
<div>
<p>자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와</p>
<p>1. 이름이 같아야 한다.
2. 매개변수가 같아야 한다.
3. 반환타입이 같아야한다.</p>
 선언부가 서로 일치해야 함. 다만 접근 제어자와 예외는 제한된 조건 하에서만 다르게 변경이 가능  <br>
  1) 조상의 접근제어자가 protected라면, protected이나  public이어야함. <br>
  2) 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다. <br>
  3) 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
  </div>
  
  
  <div>
    <h3>P329  오버라이딩 vs 오버로딩</h3>
    1. 오버로딩(overloading) - 기존에 없는 새로운 메서드를 정의하는 것 <br>
    2. 오버라이딩(overriding) - 상속받은 메서드의 내용을 변경하는 것
  </div>
  
  
  
    super
    1.상속받은 멤버와 자신의 멤버와 이름이 같을 때는 super를 붙여서 구별할 수 있다. 
    -> 조상클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 쓰는 것이 좋다.
    2. static메서드에서는 사용할 수 없고 인스턵스메서드에서만 사용할 수 있다. 
    -EX) SuperTest.java, SuperTest2.java (Package Name : S20221031)
    
    super() 생성자
    1. 조상 클래스의 생성자를 호출하는데 사용된다.
    - 조상의 멤버가 초기화 되어야함.-> 만약에 없으면 컴파일러가 자동으로 생성 호출함.
    -EX) PointTest.java, PointTest2.java (Package Name : S20221031)
 
 
 <h1>제어자 조합시 주의해야 할 사항</h1>
     
       1. 메서드와 static과 abstract를 함께 사용할 수 없다.
       2. 클래스에 abstract와 final을 동시에 사용할 수 없다
       - 클래스에 사용되는 final은 클래스를 확장할 수 없다는 의미이고 asbtarct는 상속을 통해서만 완성되어야 한다는 의미이므로 서로 모순되기 떄문이다.
       3. abstact메서드의 접근 제어자가 private일 수 없다.
       - abstact메서드는 자손 클래스에서 구현해주어야 하는데 접근 제어자가 private이면, 자손클래스에서 접근할 수 없기 떄문이다.
       4. 메서드에 private과 final을 같이 사용할 필요는 없다.
       - 접근제어자가 private인 메서드는 오버라이딩 될 수 없기 때문임.
      
 <h2>참조변수</h2>
      - 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 같거나 적어야 한다.<br>
       1. 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다. <br>
       2. 반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다.
  <h3>참조변수 형변환</h3>
  -서로 상속관계 에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나, <br>
  <b>참조변수가 가리키는 인스턴스의 자손타이브로 형변환은 허용되지 않는다. </b><br>
  <b> 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는게 중요 </b>
  
      
 <h3>instance of 연산자</h2>  
    1. 주로 조건문에 사용되며,  '참조변수' + instaceof + '타입' 위치한다.
    2. 그리고 boolean 값으로 return (true면 형변환이 가능)
    EX) S20221113 - InstanceofTest.java
    
<h3>참조변수와 인스턴스의 연결</h2>    


       1. 조상 클래스에 선언된 멤버변수와 같은 이름의 인스턴스변수를 자손 클래스에 중복으로 정의했을 떄, 조상 타입의 참조변수로 자손 인스턴스를 참조하는 경우와
       자손 타입의 참조변수로 자손 인스턴스를 참조하는 경우는 서로 다른 결과를 얻는다.
       -> 메서드의 경우 관계업시 호출됨. 그러나 멤버변수의 경우 참조변수의 타입에 따라 달라진다. 
       -> 멤버변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우, 조상 탕비의 참조변수를 사용했을 때는 조상 클래스에 선언된 멤버변수가 사용되고,
       자손타입의 참조변수를 사용했을 떄는 자손 클래스에 선언된 멤버변수가 사용된다.
        EX) S20221113 - BindingTest.java

<br>
<br>
<br>
<p> Vector()  <br>
- 10개의 객체를 저장할 수 있는 인스턴스를 생성하고, 자동적으로 증대 - EX) S20221113 - PolyArgumentTest</p>


<h3> 인터페이스 </h3>


        1. 인터페이스 멤버들의 제약사항
        - 모든 멤버변수는 public static final 이어야 하며, 이는 생략할 수 있다.
        
        - 모든 메서드는 public abstact이어야 하며, 이를 생략할 수 있다. -> S20221114 - FighterTest.java
        단, static메서드와 디폴드 메서드는 예외(JDK1.8부터)
        
        2. 인터페이스를 이용한 다중상속
        - 자바도 인터페이스를 통해 다중상속이 가능하나 구현하는 경우는 거의 없다!
        
        3. 인터페이스를 이용한 다옇ㅇ성
        - 인터페이스 타입의 매개변수가 갖는 의미는 메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공
        -> EX) S20221114 - ParserTest
        
        - ★리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.★
        
        4. 인터페이스의 장점
        1) 개발시간 단축
        2) 표준화 가능
        3) 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
        4) 독립적인 프로그래밍이 가능하다.
        
        5. 인터페이스의 이해 - 반드시 염두에 두고 있어야 함
        1) 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.
        2) 메서더를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다.(내용은 몰라도됨)
        EX) S20221114 - InterfaceTest.java, InterfaceTest2.java, InterfaceTest3.java
        
        5. 디폴트 메서드
        ㅁ 새로추가된 디폴트 메서드가 기존의 메서드와 이름이 중복되어 출돌하는 경우가 발생시 해결 규칙
        1) 여러 인터페이스의 디폴트 메서득 ㅏㄴ의 충돌
        -> 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
        2) 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
        -> 종산 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.
        => EX) S20221114 - DafaultMethodTest
        
       
<h3> 내부 클래스 </h3>


        1. 내부 클래스의 장점
        - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
        - 코드의 복잡성을 줄일 수 있다.



<h3> 예외처리(Exception) </h3>


        1. 프로그램 오류
        1) 컴파일 에러 : 컴파일 시 발생하는 에러
        2) 런타임 에러 - 실행 시에 발생하는 에러
        3) 논리적 에러 - 실행은 되지만, 의도와 다르게 동작하는 것
        
        - 컴파일을 에러없이 성공적으로 마쳤다고 해서 실행 시에도 에러가 발생하지 않느 것은 아니다.
        -> 실행 도중에 발생할 수 있는 잠재적인 오류까지 검사할 수 없기 떄문에
        
        - 에러(Error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
        - 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
        
        - Exception클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
        - RuntimeException클래스들 : 프로그래머의 실수로 발생하는 예외
        
        2. 예외처리하기 - try-catch문
        - 예외처리(exception handling) : 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성
        -> 예외의 발생으로 인한 실행 중인 프로그램의 갑작스런 비정상 종료를 막고, 정상적인 실행상태를 유지할 수 있도록
        
        
        3. Exception 종류
        1) ArithmeticException - 산술연산과정에서 오류가 있을 때 발생하는 오류 - 정수는 0으로 나누면 오류 발생 -      EX) S20221204 - ExceptionEx2.java
        2) printStackTrace() - 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다. -  EX) S20221204 - ExceptionEx8.java
        3) getMessage() - 발생한 예외크래스의 인스턴스에 저장된 메시지를 얻을 수 있다.  -  EX) S20221204 - ExceptionEx8.java
        
        4. try-catch문의 흐름 -   EX) S20221204 - ExceptionEx4.java
        ■ try블럭 내에서 예외가 발생한 경우,
        1) try블럭 내에서 예외가 일치하는 catch블럭이 있는지 확인한다.
        2) 일치하는 catch블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
           만일, 일치하는 catch블럭을 차지 못하면, 예외는 처리되지 못한다.
           
        ■ try블럭 내에서 예외가 발생하지 않는 경우,
        1) catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속 한다.
        
        5. 예외의 발생과 catch블럭  -   EX) S20221204 - ExceptionEx7.java
        
        6. 멀티 catch블럭
        - JDK1.7부터 여러 catch블럭을 '|' 기호를 활용해 사용 가능.
        -> 그러나 거의 사용할일 별로 없음.
        
        7. 예외 발생시키기 -   EX) S20221204 - ExceptionEx9.java
        1) 먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만듬
        - Exception e = new Exception("고의 발생");
        
        2) 키워드 throw를 이용해서 예외를 발생시킨다.
        - throw e;
     
        8. 메서드에 예외 선언하기 -   EX) S20221204 - FInallyTest3.java

        9. finally -   EX) S20221204 - ExceptionEx15.java
        - try-> catch -> finally 순으로
        
        10. 자동 자원 반환 - try-with-resources문  
        -   EX) S20221204 - TryWithResource.java
        
        11. 사용자정의 예외 만들기
        - 왠만하면 사용하지말고, 기존에 있는 예외처리 사용할     -   EX) S20221204 - NewExceptionTest.java
        
        
        
<h3> java.lang패키지와 유용한 클래 </h3> 

<h5> hashCode() </h5> 

        - 데이터관리기법 중 하나로, 다량의 데이터를 저장하고 검색하는 데 유용하다.
        * 해싱기법을 사용하는 HashMap이나 HashSet과 같은 클래스에 저장할 객체라면 반드시 hashCode메서드를 오버라이딩해야 한다.
        - identityHashCode는 객체의 주소값으로 해시코드를 생성하기 떄문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장
        EX) S20221214.HashCodEx1.java


<h3>Collections Framework</h3>
<header>LinkedList </header>
1. 크기를 변경할 수 없다.
-> 실행속도를 향상시키기 위해서는 충분히 큰 크기의 배열을 생성해야 하므로 메모리가 낭비
2. 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
-> 차례대로 데이터를 추가하고 마지막에서부터 데이터를 삭제하는 것은 빠르지만, 중간에 추가하려면 빈자리를 만들기 위해 다른 데이터들을 복사해서 이동해야한다.

※ ArrayList vs LinkedList
1. 순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
2. 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다
- LinkedList는 각 요소간의 연결만 변경해주면 되기 떄문에 처리속도가 상당히 빠르다.
- 반면에 ArrayList는 각 요소들을 재배치하여 추가할 공간을 확보하거나 빈 공간을 채워야하기 때문에 처리속도가 늦다.

<header>Stack과 Queue</header>
1. Stack : LIFO(Last In First Out)
- 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로
2. Queue : FIFO(First In First Out)
- 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)
