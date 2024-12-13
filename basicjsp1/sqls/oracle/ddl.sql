create table study1 (
    study_no        number          primary key,
    study_content   varchar2(30)    not null,
    study_prior     number          not null,
    reg_date        date            default sysdate
);

create sequence seq_study_no nocache;