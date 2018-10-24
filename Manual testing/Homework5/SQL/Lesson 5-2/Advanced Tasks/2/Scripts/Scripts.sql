

/*Task description:On diagram you see relationships between tables. Please write SQL query to retrieve aggregate table displayed below.*/

SELECT Inst.InstrumentCode, Rat.RatingValue, RatT.RatingTypeCode, RatA.RatingAgencyName
FROM lesson5_2.instrument AS Inst
JOIN lesson5_2.rating AS Rat ON Inst.ReportingContextId=Rat.ReportingContextId
JOIN lesson5_2.ratingtype AS RatT ON Inst.ReportingContextId=RatT.ReportingContextId
JOIN lesson5_2.ratingagency AS RatA ON Inst.ReportingContextId=RatA.ReportingContextId





