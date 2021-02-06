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

insert into LIBRARY values (library_seq.nextval, '�Ϻ��� ������� 2136 �̰� �ϳ��� ��','Ȳ����','�ֵ���ũ','8983007133 9788983007131', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1170365%3Ftimestamp%3D20210109150659', '�뿩��');
insert into LIBRARY values (library_seq.nextval, '��Ŀ�� �ڵ��߻� �߱��� ù����. 1(��Ŀ�� ���� �߱��� ȸȭ �ø���)','�����','�п�','8965422124 9788965422129', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F913574%3Ftimestamp%3D20210109144332', '�뿩����');
insert into LIBRARY values (library_seq.nextval, '�����ξ� ���� �Ӵ����(������)','������','����','8938707083 9788938707086', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F554282%3Ftimestamp%3D20201213133553', '�뿩��');
insert into LIBRARY values (library_seq.nextval, '����ȸȭ �ٽ����� 233','��ȿ��','������','1159240590 9791159240591', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1586757%3Ftimestamp%3D20210109144258', '�뿩����');
insert into LIBRARY values (library_seq.nextval, '������ �ູ ö��','�� �ʸ���','���','8996917737 9788996917731', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1475459%3Ftimestamp%3D20201102135126', '�뿩��');
insert into LIBRARY values (library_seq.nextval, '���� ������: 123(My Little Tiger)(�γ� ������ 17)(������)','�Ｚ���ǻ� ������','�Ｚ���ǻ�','8915104994 9788915104990', 'https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F388495%3Ftimestamp%3D20210131154556', '�뿩����');

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

select * from library where l_rent = '�뿩��';

select * from LIBRARY;



update library set l_rent = '�뿩����' where l_title like '%�����ξ�%';

update library set l_rent = '�뿩��' where l_title like '%�Ϻ���%' and l_num = 1;



select * from LIBRARY where l_title like '%123%' order by l_num;
select * from library where l_title like '%�Ϻ���%' and l_rent = '�뿩��';

insert into user_lib values ('id', 'id');

select * from user_lib where m_id = 'id' and m_pw = 'id';


select * from library where l_title like '%�Ϻ���%';
