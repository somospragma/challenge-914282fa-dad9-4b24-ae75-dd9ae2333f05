# Diseño de Arquitectura SOA para un Sistema de Pagos

El sistema de pagos de una fintech necesita ser escalable, mantenible y capaz de integrarse con múltiples proveedores de servicios financieros. El equipo de arquitectura ha decidido adoptar una arquitectura orientada a servicios (SOA) con microservicios para lograr estos objetivos. Tu tarea es diseñar una arquitectura SOA que integre diferentes servicios, utilizando patrones de integración adecuados.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Diseño de arquitectura SOA |
| **Nivel** | advanced-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 4-5 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Servicios y Patrones de Integración

**Objetivo:** Identificar los servicios necesarios y los patrones de integración apropiados.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los servicios clave que deben formar parte del sistema de pagos.
- Propón patrones de integración (como orquestación, coreografía, event sourcing) que se ajusten a las necesidades del sistema.

**Entregable:** Lista de servicios y patrones de integración propuestos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la escalabilidad y mantenibilidad al elegir los servicios y patrones.
- Piensa en cómo los servicios se comunicarán entre sí.

</details>

### Fase 2: Diseño de la Arquitectura SOA

**Objetivo:** Diseñar la arquitectura SOA con los servicios y patrones de integración identificados.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crea un diseño de la arquitectura SOA que incluya los servicios identificados y los patrones de integración propuestos.
- Identifica posibles puntos de fallo y cómo mitigarlos.

**Entregable:** Diagrama de la arquitectura SOA con servicios y patrones de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la comunicación asíncrona y síncrona entre servicios.
- Piensa en la resiliencia y tolerancia a fallos del sistema.

</details>

### Fase 3: Evaluación y Justificación de Decisiones

**Objetivo:** Evaluar y justificar las decisiones tomadas en el diseño de la arquitectura SOA.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Evalúa las decisiones tomadas en las fases anteriores.
- Justifica cada decisión con argumentos sólidos y considera posibles alternativas.

**Entregable:** Documento que evalúa y justifica las decisiones tomadas en el diseño de la arquitectura SOA.

<details>
<summary>Pistas de conocimiento</summary>

- Considera trade-offs y consecuencias a largo plazo de tus decisiones.
- Piensa en cómo comunicarías estas decisiones a diferentes audiencias.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un patrón de integración y por qué es importante en una arquitectura SOA?
- **paraQueSirve**: ¿Para qué sirve la orquestación en una arquitectura SOA y en qué casos es preferible sobre la coreografía?
- **comoSeUsa**: ¿Cómo se usa el event sourcing en una arquitectura SOA y cuáles son sus ventajas y desventajas?
- **erroresComunes**: ¿Cuáles son los errores comunes al diseñar una arquitectura SOA y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una arquitectura SOA y cómo se pueden justificar?

## Criterios de Evaluacion

- Identificar servicios clave y patrones de integración apropiados.
- Diseñar una arquitectura SOA coherente y resiliente.
- Evaluar y justificar decisiones tomadas en el diseño de la arquitectura SOA.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
