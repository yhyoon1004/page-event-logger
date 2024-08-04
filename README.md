# Service Function
사용자가 웹페이지에서 어느 부분에 인터렉션이 많은지 통계 및 추적하는 기능을 제공하는 토이 프로젝트

# Service Planning
해당 어플리케이션이 완성시 예정 계획
- aws ec2 instance 에 서비스를 올려 배포 예정
- docker compose로 컨테이너들을 구성해 마이크로 서비스 환경 구축
- aws ec2 instance를 증설하여 docker node 추가
- docker swarm을 통해 오케스트레이션 동작
- 모니터링 기능 추가

# Service Architecture
![pageEventLogger](https://github.com/user-attachments/assets/4d73e92e-a695-469f-885e-041d3dd29590)

  
# Developing Try-Fix 
- SpringBatch 까지 사용하기에는 대용량 데이터 반복 처리가 아닌 것 같다 판단 =>  스프링프레임웍 context 라이브러리에 내장되어 있는 Schedule 기능으로 변경하자.(나중에 재시도 처리 혹은 모니터링이 필요할 때 추가 계발해보자..)