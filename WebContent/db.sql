create table library (
	l_num number(5) primary key,
	l_title varchar2(200 char) not null,
	l_authors varchar2(200 char) not null,
	l_publisher varchar2(200 char) not null,
	l_isbn varchar2(200 char) not null,
	l_thumbnail varchar2 (300 char) not null,
	l_rent varchar2(200 char) not null
);

create sequence library_seq;

insert into LIBRARY values (library_seq.nextval, '일본어 상용한자 2136 이거 하나면 끝','황정현','솔데스크','8983007133 9788983007131', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659', '대여중');
insert into LIBRARY values (library_seq.nextval, '해커스 자동발사 중국어 첫걸음. 1(해커스 기초 중국어 회화 시리즈)','김범진','학원','8965422124 9788965422129', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332', '대여가능');
insert into LIBRARY values (library_seq.nextval, '스페인어 숙어 속담사전(엣센스)','서예슬','종로','8938707083 9788938707086', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553', '대여중');
insert into LIBRARY values (library_seq.nextval, '영어회화 핵심패턴 233','임효진','을지로','1159240590 9791159240591', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258', '대여가능');
insert into LIBRARY values (library_seq.nextval, '러셀의 행복 철학','팀 필립스','빅북','8996917737 9788996917731', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126', '대여중');
insert into LIBRARY values (library_seq.nextval, '수학 연습장: 123(My Little Tiger)(두뇌 연습장 17)(스프링)','삼성출판사 편집부','삼성출판사','8915104994 9788915104990', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F388495%3Ftimestamp%3D20210131154556', '대여가능');

create table user_lib (
	m_id varchar2(10 char) primary key,
	m_pw varchar2(10 char) not null
);

create table apply (
	a_num number(5) primary key,
	a_title varchar2(200 char) not null,
	a_authors varchar2(200 char) not null,
	a_publisher varchar2(200 char) not null,
	a_isbn varchar2(200 char) not null,
	a_thumbnail varchar2 (300 char) not null
);

create sequence apply_seq;


select * from apply;

select * from library where l_rent = '대여중';

select * from LIBRARY;



update library set l_rent = '대여가능' where l_title like '%스페인어%';

update library set l_rent = '대여중' where l_title like '%일본어%' and l_num = 1;



select * from LIBRARY where l_title like '%123%' order by l_num;
select * from library where l_title like '%일본어%' and l_rent = '대여중';

insert into user_lib values ('id', 'id');

select * from user_lib where m_id = 'id' and m_pw = 'id';


select * from library where l_title like '%일본어%';
