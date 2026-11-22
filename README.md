# emarket-api-gateway
Единая публичная точка входа, маршрутизация и базовая защита API. 
Spring Cloud Gateway, маршрутизация, rate limiting, политики доступа.

### Responsibilities
- Route requests to BFF (emarket-bff-web, emarket-bff-mobile).
- Rate limit login attempts.
- Enforce request size limits.
- Reject malformed requests where possible.
- Strip untrusted forwarding headers.
- Configure timeouts.
- Prevent direct public access to backend services.
