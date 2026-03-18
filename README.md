# MARS Dark Mode

MARS (MIPS Assembler and Runtime Simulator) 4.5 with dark mode support, powered by [FlatLaf](https://www.formdev.com/flatlaf/).

Forked from [dpetersanderson/MARS](https://github.com/dpetersanderson/MARS).

## Features

- FlatLaf Dark theme applied to the entire MARS UI (menus, toolbars, dialogs, tables, etc.)
- Editor area with dark background (`#1E1E1E`) and light text (`#D4D4D4`)
- VS Code Dark+ syntax highlighting color scheme
- Dark-themed register/data/text segment tables with matching row colors
- Dark-themed caret, selection, and line highlight colors

## Usage

Download `mars-dark.jar` from the [Releases](../../releases) page, then run:

```bash
java -jar mars-dark.jar
```

Requires Java 11 or later.

## Building from Source

```bash
git clone https://github.com/xinshoutw/mars-dark.git
cd mars-dark
./gradlew shadowJar
java -jar build/libs/mars-dark.jar
```

## What's Changed

| File | Change |
|------|--------|
| `MarsLauncher.java` | New entry point — sets `FlatDarkLaf` + UIManager dark overrides |
| `mars/Settings.java` | Default row/highlight colors changed to dark variants |
| `mars/venus/editors/jeditsyntax/TextAreaPainter.java` | Editor foreground/background → dark |
| `mars/venus/editors/jeditsyntax/TextAreaDefaults.java` | Caret → white, selection → dark blue, line highlight → dark gray |
| `mars/venus/editors/jeditsyntax/SyntaxUtilities.java` | Syntax styles → VS Code Dark+ color scheme |

### Syntax Color Mapping

| Token | Color | Description |
|-------|-------|-------------|
| NULL | `#D4D4D4` | Default text |
| COMMENT | `#6A9955` | Comments (green) |
| KEYWORD1 | `#569CD6` | Instructions (blue) |
| KEYWORD2 | `#9CDCFE` | Registers (light blue) |
| KEYWORD3 | `#C586C0` | Directives (purple) |
| LITERAL1 | `#CE9178` | String literals (orange) |
| LITERAL2 | `#B5CEA8` | Numeric literals (light green) |
| LABEL | `#DCDCAA` | Labels (yellow) |
| MACRO_ARG | `#4EC9B0` | Macro arguments (teal) |

## Credits

- [MARS](https://github.com/dpetersanderson/MARS) by Pete Sanderson and Ken Vollmar
- [FlatLaf](https://www.formdev.com/flatlaf/) by FormDev Software GmbH

## License

MARS is distributed under the MIT License. FlatLaf is licensed under the Apache License 2.0.
