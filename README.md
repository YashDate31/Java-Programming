# Java Programming (MSBTE 314317)

Professional, curriculum-aligned Java practical repository for MSBTE Course Code **314317**.

## Highlights

- Unit-wise and practical-wise organized code under `Manual/`
- Coverage from Practical 1 to Practical 30
- Naming and structure standardized for submissions and revision
- Ready for GitHub Actions compile checks

## Repository Structure

- `Manual/README.md` — detailed project overview
- `Manual/MIGRATION_MAP.md` — old-to-new mapping
- `Manual/Unit_1_Fundamentals/`
- `Manual/Unit_2_OOP_and_Exceptions/`
- `Manual/Unit_3_AWT_and_Swing/`
- `Manual/Unit_4_Networking/`
- `Manual/Unit_5_JDBC/`
- `.github/workflows/ci.yml` — compile validation workflow

## Prerequisites

- JDK 17+ (recommended)
- VS Code / IntelliJ / Eclipse

## Local Validation

Compile all Java files in `Manual`:

- Find all `.java` files recursively
- Compile with `javac -encoding UTF-8`

## Notes

- JDBC practicals (`Pr27`–`Pr30`) require a MySQL database and JDBC driver in classpath.
- `.class` files are ignored via `.gitignore`.

## Author

YashDate31
