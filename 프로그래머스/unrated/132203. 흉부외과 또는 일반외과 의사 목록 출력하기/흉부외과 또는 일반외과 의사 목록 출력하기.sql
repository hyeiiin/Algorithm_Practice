-- 코드를 입력하세요 
-- date_format 문자열 날짜 변경 
-- %Y년도 (4자리 표기) %y년도 (뒤에 2자리 표기)
SELECT DR_NAME,DR_ID,MCDP_CD,date_format(HIRE_YMD,'%Y-%m-%d')as HIRE_YMD
from DOCTOR
where MCDP_CD in ('CS','GS')
order by HIRE_YMD desc,DR_NAME asc