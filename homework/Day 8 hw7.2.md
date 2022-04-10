# Day 8 homework 7.2

### view vs stored procedure

| View                                                                                                                                                           | Stored procedure                                                                                                                              |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| A View represents a virtual table. You can join multiple tables in a view and use the View to present the data as if the data were coming from a single table. | A Stored Procedure is precompiled database query that improves the security, efficiency and usability of database client/server applications. |
| Does **NOT** accepts parameters                                                                                                                                | Accept parameters                                                                                                                             |
| Can be used as building block in large query                                                                                                                   | Can **NOT** be used as a building block in large query                                                                                        |
| Can contain only **one** single `Select` query                                                                                                                 | Can contain several statements like `if`, `else`, `loop` etc                                                                                  |
| Can **NOT** perform modification to any table                                                                                                                  | Can perform modification to one or several tables                                                                                             |
| Can be sued (sometimes) as the target for `INSERT`, `UPDATE`, `DELETE` queries                                                                                 | Can **NOT** be sued as the target for `INSERT`, `UPDATE`, `DELETE` queries                                                                    |

### Examples
```sql
-- view 
CREATE VIEW vw_user_profile
AS
  SELECT A.user_id, B.profile_description
  FROM tbl_user A LEFT JOIN tbl_profile B ON A.user_id = b.user_id
GO

-- stored proceddure
SELECT profile_description FROM vw_user_profile WHERE user_id = @ID
CREATE PROCEDURE dbo.getDesc
    @ID int
AS
BEGIN
    SELECT profile_description FROM vw_user_profile WHERE user_id = @ID
END
GO
```

### view vs material view
| BASIS FOR COMPARISON | View                                                                    | Material view                                                              |
|----------------------|-------------------------------------------------------------------------|----------------------------------------------------------------------------|
| Basic                | A View is never stored it is only displayed.                            | A Materialized View is stored on the **disk**.                             |
| Define               | View is the virtual table formed from one or more base tables or views. | Materialized view is a **physical copy** of the base table.                |
| Update               | View is updated each time the virtual table (View) is used.             | Materialized View has to be updated manually or using triggers.            |
| Speed                | **Slow** processing.                                                    | **Fast** processing.                                                       |
| Memory usage         | View do **NOT** require memory space.                                   | Materialized View utilizes memory space.                                   |
| Syntax               | Create View V As                                                        | Create Materialized View V Build [clause] Refresh [clause] On [Trigger] As |

### When to Use View vs Materialized View in SQL
Mostly in an application, we use **views** because they are a more feasible, only logical representation of table data no extra space is needed.

We easily get a replica of data and we can perform our operation on that data without affecting actual table data but when we see a performance that is crucial for a large application they use a materialized view where Query Response time matters.

So, **Materialized views** are used mostly with data warehousing or business intelligence application.

### Reference
* https://medium.com/codestorm/stored-procedure-vs-view-e4adb6f9e910
* https://stackoverflow.com/questions/5194995/what-is-the-difference-between-a-stored-procedure-and-a-view
* https://techdifferences.com/difference-between-view-and-materialized-view.html
* https://www.java67.com/2012/11/what-is-difference-between-view-vs-materialized-view-database-sql.html
* 